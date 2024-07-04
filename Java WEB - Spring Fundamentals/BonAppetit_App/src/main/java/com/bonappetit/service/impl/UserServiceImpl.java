package com.bonappetit.service.impl;

import com.bonappetit.model.dto.UserLoginDto;
import com.bonappetit.model.dto.UserRegisterDto;
import com.bonappetit.model.entity.Recipe;
import com.bonappetit.model.entity.User;
import com.bonappetit.repo.RecipeRepository;
import com.bonappetit.repo.UserRepository;
import com.bonappetit.service.CurrentLoggedUser;
import com.bonappetit.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;
    private final CurrentLoggedUser currentLoggedUser;
    private final RecipeRepository recipeRepository;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder, CurrentLoggedUser currentLoggedUser, RecipeRepository recipeRepository) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.currentLoggedUser = currentLoggedUser;
        this.recipeRepository = recipeRepository;
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

    @Override
    public void rateRecipe(Long id) {
        Recipe recipe = this.recipeRepository.findById(id).get();
        User user = this.userRepository.findFirstById(this.currentLoggedUser.getId()).get();
        user.getFavouriteRecipes().add(recipe);
        this.userRepository.save(user);
    }
}
