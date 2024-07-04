package com.bonappetit.controller;

import com.bonappetit.model.dto.AddRecipeDto;
import com.bonappetit.model.entity.CategoryEnum;
import com.bonappetit.service.CurrentLoggedUser;
import com.bonappetit.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class AddRecipeController {

    private final CurrentLoggedUser currentLoggedUser;
    private final RecipeService recipeService;

    public AddRecipeController(CurrentLoggedUser currentLoggedUser, RecipeService recipeService) {
        this.currentLoggedUser = currentLoggedUser;
        this.recipeService = recipeService;
    }


    @ModelAttribute("addRecipeDto")
    public AddRecipeDto addRecipeDto() {
        return new AddRecipeDto();
    }

    @GetMapping("/recipe-add")
    public String addRecipe(Model model) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }

        model.addAttribute("allCategories", CategoryEnum.values());
        return "recipe-add";
    }

    @PostMapping("/recipe-add")
    public String addRecipe(@Valid AddRecipeDto addRecipeDto,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("addRecipeDto", addRecipeDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.addRecipeDto", bindingResult);
            return "redirect:/recipe-add";
        }

        this.recipeService.addRecipe(addRecipeDto);

        return "redirect:/home";
    }
}
