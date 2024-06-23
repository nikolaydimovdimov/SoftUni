package com.paintingscollectors.model.dto;

import javax.validation.constraints.Size;

public class UserLoginDto {

    @Size(min = 3, max = 20,message = "{user.login.username.length}")
    private String username;


    @Size(min = 3, max = 20, message = "{user.login.password.length}")
    private String password;

    public UserLoginDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
