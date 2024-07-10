package com.dictionaryapp.controller;

import com.dictionaryapp.model.dto.UserLoginDto;
import com.dictionaryapp.service.CurrentLoggedUser;
import com.dictionaryapp.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


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

        return "redirect:/home";
    }
}
