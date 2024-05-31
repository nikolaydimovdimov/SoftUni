package bg.softuni.mobilelele.web;

import bg.softuni.mobilelele.service.UserService;
import bg.softuni.mobilelele.models.dto.UserRegistrationDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/register")
    public String register() {
        return "auth-register";
    }

    @PostMapping("/users/register")
    public String register(UserRegistrationDto userRegistrationDto) {

        userService.registerUser(userRegistrationDto);

        return "auth-register";
    }
}
