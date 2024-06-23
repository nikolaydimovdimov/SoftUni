package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.UserLoginDto;
import com.paintingscollectors.model.dto.UserRegisterDto;

public interface UserService {

    boolean addUser(UserRegisterDto userRegisterDto);
    boolean loginUser(UserLoginDto userLoginDto);
}
