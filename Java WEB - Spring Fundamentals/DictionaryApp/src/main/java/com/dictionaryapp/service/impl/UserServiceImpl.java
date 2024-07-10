package com.dictionaryapp.service.impl;

import com.dictionaryapp.model.dto.UserLoginDto;
import com.dictionaryapp.model.dto.UserRegisterDto;
import com.dictionaryapp.model.entity.User;
import com.dictionaryapp.repo.UserRepository;
import com.dictionaryapp.service.CurrentLoggedUser;
import com.dictionaryapp.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final CurrentLoggedUser currentLoggedUser;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, CurrentLoggedUser currentLoggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.currentLoggedUser = currentLoggedUser;
    }

    @Override
    public void addNewUser(UserRegisterDto userRegisterDto) {
        User userMapped = modelMapper.map(userRegisterDto, User.class);
        userMapped.setPassword(this.passwordEncoder.encode(userRegisterDto.getPassword()));
        this.userRepository.save(userMapped);
    }

    @Override
    public boolean loginUser(UserLoginDto userLoginDto) {

        User foundUser = this.userRepository
                .findFirstByUsername(userLoginDto.getUsername())
                .orElse(null);

        if (foundUser != null ) {
            String loginPassword = userLoginDto.getPassword();
            String foundPassword = foundUser.getPassword();
            if (passwordEncoder.matches( loginPassword, foundPassword)) {
                this.currentLoggedUser.login(foundUser.getId(), userLoginDto.getUsername());
                return true;
            }
        }
        return false;
    }


}
