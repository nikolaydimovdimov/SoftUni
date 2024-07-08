package com.bonappetit.controller;

import com.bonappetit.model.entity.CategoryEnum;
import com.bonappetit.repo.UserRepository;
import com.bonappetit.service.CategoryService;
import com.bonappetit.service.CurrentLoggedUser;
import com.bonappetit.service.RecipeService;
import com.bonappetit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final CurrentLoggedUser currentLoggedUser;
    private final UserService userService;
    private final RecipeService recipeService;
    private final UserRepository userRepository;

    public HomeController(CurrentLoggedUser currentLoggedUser, UserService userService, RecipeService recipeService, UserRepository userRepository) {
        this.currentLoggedUser = currentLoggedUser;
        this.userService = userService;
        this.recipeService = recipeService;
        this.userRepository = userRepository;
    }



    @GetMapping("/home")
    public String home(Model model) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        model.addAttribute("currentLoggedUser", currentLoggedUser);
        model.addAttribute("desserts", this.recipeService.getAllRecipesByCategory(CategoryEnum.DESSERT));
        model.addAttribute("main_dishes", this.recipeService.getAllRecipesByCategory(CategoryEnum.MAIN_DISH));
        model.addAttribute("cocktails", this.recipeService.getAllRecipesByCategory(CategoryEnum.COCKTAIL));
        model.addAttribute("favorites", this.userRepository.findFirstById(this.currentLoggedUser.getId()).get().getFavouriteRecipes());
        return "home";
    }

    @GetMapping("/rate/{id}")
    public String rateRecipe(@PathVariable Long id) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        this.userService.rateRecipe(id);
        return "redirect:/home";
    }
}
