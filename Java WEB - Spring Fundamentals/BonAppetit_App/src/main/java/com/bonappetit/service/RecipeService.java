package com.bonappetit.service;

import com.bonappetit.model.dto.AddRecipeDto;
import com.bonappetit.model.entity.CategoryEnum;
import com.bonappetit.model.entity.Recipe;
import jdk.jfr.Category;

import java.util.List;

public interface RecipeService {

    List<Recipe> getAllRecipesByCategory(CategoryEnum categoryEnum);
    void addRecipe(AddRecipeDto addRecipeDto);
}
