package com.bonappetit.model.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AddRecipeDto {

    @NotBlank(message = "{recipe.add.name.not.blank}")
    @Size(min = 2, max = 40,message = "{recipe.add.name.length}")
    private String name;

    @NotBlank(message = "{recipe.add.ingredients.not.blank}")
    @Size(min = 2, max = 150,message = "{recipe.add.ingredients.length}")
    private String ingredients;

    @NotBlank(message = "{recipe.add.category.not.blank}")
    private String category;

    public AddRecipeDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
