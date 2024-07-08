package com.bonappetit.model.dto;


import com.bonappetit.model.entity.CategoryEnum;
import com.google.gson.annotations.Expose;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CategorySeedDto {
    @Expose
    @NotNull
    private CategoryEnum categoryName;

    @Expose
    @NotBlank
    private String description;

    public CategorySeedDto() {
    }

    public CategoryEnum getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(CategoryEnum categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
