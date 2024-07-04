package com.bonappetit.service;

import com.bonappetit.model.dto.UserLoginDto;
import com.bonappetit.model.dto.UserRegisterDto;
import com.bonappetit.model.entity.User;

public interface UserService {

    void addNewUser(UserRegisterDto userRegisterDto);
    boolean loginUser(UserLoginDto userLoginDto);
    void rateRecipe(Long id);
}
