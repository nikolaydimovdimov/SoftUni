package com.bonappetit.controller;

import com.bonappetit.service.CurrentLoggedUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final CurrentLoggedUser currentLoggedUser;

    public IndexController(CurrentLoggedUser currentLoggedUser) {
        this.currentLoggedUser = currentLoggedUser;
    }

    @GetMapping("/")
    public String index() {
        if(currentLoggedUser.isLogged()){
            return "redirect:/home";
        }
        return "index";
    }

    @GetMapping("/index")
    public String indexTwo() {
        if(currentLoggedUser.isLogged()){
            return "redirect:/home";
        }
        return "index";
    }


}
