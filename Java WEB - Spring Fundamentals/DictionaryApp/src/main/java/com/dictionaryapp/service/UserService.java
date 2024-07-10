package com.dictionaryapp.service;


import com.dictionaryapp.model.dto.UserLoginDto;
import com.dictionaryapp.model.dto.UserRegisterDto;

public interface UserService {

    void addNewUser(UserRegisterDto userRegisterDto);
    boolean loginUser(UserLoginDto userLoginDto);
}
