package com.paintingscollectors.controller;

import com.paintingscollectors.model.dto.UserLoginDto;
import com.paintingscollectors.service.CurrentUser;
import com.paintingscollectors.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class LoginController {

    private final CurrentUser currentUser;
    private final UserService userService;

    public LoginController(CurrentUser currentUser, UserService userService) {
        this.currentUser = currentUser;
        this.userService = userService;
    }

    @ModelAttribute
    public UserLoginDto userLoginDto() {
        return new UserLoginDto();
    }


    @GetMapping("/log")
    public String login() {
        if(this.currentUser.isLogged()){
            return "redirect:/";
        }
        return "login";
    }

    @PostMapping("/log")
    public String loginPost(@Valid UserLoginDto userLoginDto,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        if(this.currentUser.isLogged()){
            return "redirect:/";
        }

        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userLoginDto", userLoginDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userLoginDto", bindingResult);
            return "redirect:/log";
        }

        boolean isSuccessfullyUserLoggedIn = this.userService.loginUser(userLoginDto);
        if (!isSuccessfullyUserLoggedIn) {
            redirectAttributes.addFlashAttribute("userLoginDto", userLoginDto);
            redirectAttributes.addFlashAttribute("loginError", true);
            return "redirect:/log";
        }
        System.out.println("Login successful !!!!!!!!!!!!!!!!!!");

        return "redirect:/";
    }
}
