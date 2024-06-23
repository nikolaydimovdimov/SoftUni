package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.UserRegisterDto;
import com.paintingscollectors.model.entity.User;
import com.paintingscollectors.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public boolean addUser(UserRegisterDto userRegisterDto) {

        if (this.userRepository
                .existsUserByUsernameOrEmail(userRegisterDto.getUsername(), userRegisterDto.getEmail())) {
            return false;
        }

        User mappedUser = this.modelMapper.map(userRegisterDto, User.class);
        mappedUser.setPassword(this.passwordEncoder.encode(userRegisterDto.getPassword()));
        this.userRepository.save(mappedUser);

        return true;
    }
}
