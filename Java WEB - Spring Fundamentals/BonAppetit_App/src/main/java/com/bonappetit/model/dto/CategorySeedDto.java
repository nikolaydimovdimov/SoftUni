package com.bonappetit.model.dto;


import com.google.gson.annotations.Expose;

import javax.validation.constraints.NotBlank;

public class CategorySeedDto {
    @Expose
    @NotBlank
    private String categoryName;

    @Expose
    @NotBlank
    private String description;

    public CategorySeedDto() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
