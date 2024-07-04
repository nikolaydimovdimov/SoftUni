package com.bonappetit.controller;

import com.bonappetit.service.CurrentLoggedUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserLogoutController {

    private final CurrentLoggedUser currentLoggedUser;

    public UserLogoutController(CurrentLoggedUser currentLoggedUser) {
        this.currentLoggedUser = currentLoggedUser;
    }


    @GetMapping("/logout")
    public String logout() {
        if(this.currentLoggedUser.isLogged()) {
            this.currentLoggedUser.logout();
            return "redirect:/";
        }
        return "redirect:/";
    }
}
