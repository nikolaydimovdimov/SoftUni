package com.paintingscollectors.controller;

import com.paintingscollectors.service.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final CurrentUser currentUser;

    public HomeController(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    @GetMapping("/home")
    public String home() {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        return "home";
    }
}
