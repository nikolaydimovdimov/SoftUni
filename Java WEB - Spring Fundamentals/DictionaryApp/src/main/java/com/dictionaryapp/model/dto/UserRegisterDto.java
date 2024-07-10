package com.dictionaryapp.model.dto;


import jakarta.validation.constraints.*
        ;

public class UserRegisterDto {

    @NotBlank(message = "{user.register.username.not.blank}")
    @Size(min = 3, max = 20,message = "{user.register.username.length}")
    private String username;

    @NotBlank(message = "{user.register.email.not.blank}")
    private String email;

    @NotBlank(message = "{user.register.password.not.blank}")
    @Size(min = 3, max = 20,message = "{user.register.password.length}")
    private String password;

    @NotBlank(message = "{user.register.confirmPassword.not.blank}")
    @Size(min = 3, max = 20,message = "{user.register.confirmPassword.length}")
    private String confirmPassword;

    public UserRegisterDto() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
