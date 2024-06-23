package com.paintingscollectors.service;

import com.paintingscollectors.model.dto.UserRegisterDto;

public interface UserService {

    boolean addUser(UserRegisterDto userRegisterDto);
}
