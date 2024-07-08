package com.bonappetit.model.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
public class Category extends BaseEntity {

    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private CategoryEnum categoryName;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private Set<Recipe> recipes;

    public Category() {
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

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }

}
