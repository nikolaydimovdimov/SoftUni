package com.bonappetit.controller;

import com.bonappetit.model.dto.UserLoginDto;
import com.bonappetit.service.CurrentLoggedUser;
import com.bonappetit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserLoginController {

    private final CurrentLoggedUser currentLoggedUser;
    private final UserService userService;

    public UserLoginController(CurrentLoggedUser currentUser, UserService userService) {
        this.currentLoggedUser = currentUser;
        this.userService = userService;
    }

    @ModelAttribute
    public UserLoginDto userLoginDto() {
        return new UserLoginDto();
    }


    @GetMapping("/login")
    public String login() {
        if(this.currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@Valid UserLoginDto userLoginDto,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        if(this.currentLoggedUser.isLogged()){
            return "redirect:/home";
        }

        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userLoginDto", userLoginDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginDto", bindingResult);
            return "redirect:/login";
        }

        boolean isSuccessfullyUserLoggedIn = this.userService.loginUser(userLoginDto);

        if (!isSuccessfullyUserLoggedIn) {
            redirectAttributes.addFlashAttribute("userLoginDto", userLoginDto);
            redirectAttributes.addFlashAttribute("loginError", true);
            return "redirect:/login";
        }
        System.out.println("Login successful !!!!!!!!!!!!!!!!!!");

        return "redirect:/home";
    }
}
