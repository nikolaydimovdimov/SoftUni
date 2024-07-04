package com.bonappetit.controller;

import com.bonappetit.model.dto.UserRegisterDto;
import com.bonappetit.repo.UserRepository;
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
public class UserRegisterController {

    private final UserService userService;
    private final CurrentLoggedUser currentLoggedUser;
    private final UserRepository userRepository;

    public UserRegisterController(UserService userService, CurrentLoggedUser currentLoggedUser, UserRepository userRepository) {
        this.userService = userService;
        this.currentLoggedUser = currentLoggedUser;
        this.userRepository = userRepository;
    }

    @ModelAttribute("userRegisterDto")
    public UserRegisterDto userRegisterDto() {
        return new UserRegisterDto();
    }

    @GetMapping("/register")
    public String register() {
        if(this.currentLoggedUser.isLogged()) {
            return "redirect:/";
        }
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid UserRegisterDto userRegisterDto,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        if(this.currentLoggedUser.isLogged()) {
            return "redirect:/";
        }
        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userRegisterDto", userRegisterDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterDto", bindingResult);
            return "redirect:/register";
        }
        if (!userRegisterDto.getPassword().equals(userRegisterDto.getConfirmPassword())) {
            redirectAttributes.addFlashAttribute("userRegisterDto", userRegisterDto);
            redirectAttributes.addFlashAttribute("registerPassMatchingError", true);
            return "redirect:/register";
        }
        if(this.userRepository.existsUserByUsernameOrEmail(userRegisterDto.getUsername(),userRegisterDto.getEmail())){
            redirectAttributes.addFlashAttribute("userRegisterDto", userRegisterDto);
            redirectAttributes.addFlashAttribute("registerUserExistError", true);
            return "redirect:/register";
        }

        this.userService.addNewUser(userRegisterDto);

        return "redirect:/login";
    }

}
