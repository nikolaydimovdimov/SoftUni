package com.bonappetit.service.impl;

import com.bonappetit.model.dto.AddRecipeDto;
import com.bonappetit.model.entity.CategoryEnum;
import com.bonappetit.model.entity.Recipe;
import com.bonappetit.model.entity.User;
import com.bonappetit.repo.CategoryRepository;
import com.bonappetit.repo.RecipeRepository;
import com.bonappetit.repo.UserRepository;
import com.bonappetit.service.CategoryService;
import com.bonappetit.service.CurrentLoggedUser;
import com.bonappetit.service.RecipeService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;
    private  final UserRepository userRepository;
    private final CurrentLoggedUser currentLoggedUser;

    public RecipeServiceImpl(RecipeRepository recipeRepository, CategoryRepository categoryRepository, ModelMapper modelMapper, UserRepository userRepository, CurrentLoggedUser currentLoggedUser) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
        this.currentLoggedUser = currentLoggedUser;
    }

    @Override
    public List<Recipe> getAllRecipesByCategory(CategoryEnum categoryEnum) {
        return this.recipeRepository
                .findAllByCategory(this.categoryRepository.findFirstByCategoryName(categoryEnum).get());
    }

    @Override
    public void addRecipe(AddRecipeDto addRecipeDto) {
        Recipe recipeMapped = modelMapper.map(addRecipeDto, Recipe.class);
        recipeMapped.setCategory(this.categoryRepository
                .findFirstByCategoryName(CategoryEnum.valueOf(addRecipeDto.getCategory())).get());
        recipeMapped.setAddedBy(this.userRepository.findFirstById(this.currentLoggedUser.getId()).get());
        this.recipeRepository.save(recipeMapped);
    }


}
