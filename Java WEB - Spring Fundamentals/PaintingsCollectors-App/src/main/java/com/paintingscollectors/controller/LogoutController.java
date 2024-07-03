package com.paintingscollectors.controller;

import com.paintingscollectors.service.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

    private final CurrentUser currentUser;


    public LogoutController(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    @GetMapping("/logout")
    public String logout() {
        if(this.currentUser.isLogged()) {
            this.currentUser.logout();
            return "redirect:/";
        }
        return "redirect:/";
    }
}
