package com.paintingscollectors.controller;

import com.paintingscollectors.model.dto.UserRegisterDto;
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
public class RegistrationController {

    private final CurrentUser currentUser;
    private final UserService userService;

    public RegistrationController(CurrentUser currentUser, UserService userService) {
        this.currentUser = currentUser;
        this.userService = userService;
    }

    @ModelAttribute("userRegisterDto")
    public UserRegisterDto userRegisterDto(){
        return new UserRegisterDto();
    }

    @GetMapping("/reg")
    public String registration() {
        if(this.currentUser.isLogged()){
            return "redirect:/";
        }
        return "register";
    }

    @PostMapping("/reg")
    public String registration(@Valid UserRegisterDto userRegisterDto,
                               BindingResult bindingResult,
                               RedirectAttributes redirectAttributes) {
        if(this.currentUser.isLogged()){
            return "redirect:/";
        }
        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("userRegisterDto", userRegisterDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userRegisterDto", bindingResult);
            return "redirect:/reg";
        }

        if (!userRegisterDto.getPassword().equals(userRegisterDto.getConfirmPassword())) {
            redirectAttributes.addFlashAttribute("userRegisterDto", userRegisterDto);
            redirectAttributes.addFlashAttribute("registerPassMatchingError", true);
            return "redirect:/reg";
        }

        if(!userService.addUser(userRegisterDto)) {
            redirectAttributes.addFlashAttribute("userRegisterDto", userRegisterDto);
            redirectAttributes.addFlashAttribute("registerUserExistError", true);
            return "redirect:/register";
        }



        return "redirect:/";
    }


}
