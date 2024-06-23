package com.paintingscollectors.controller;

import com.paintingscollectors.service.CurrentUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final CurrentUser currentUser;

    public IndexController(CurrentUser currentUser) {
        this.currentUser = currentUser;
    }

    @GetMapping("/")
    public String index() {
        if(currentUser.isLogged()){
            return "redirect:/home";
        }
        return "index";
    }

    @GetMapping("/index")
    public String indexTwo() {
        if(currentUser.isLogged()){
            return "redirect:/home";
        }
        return "index";
    }


}
