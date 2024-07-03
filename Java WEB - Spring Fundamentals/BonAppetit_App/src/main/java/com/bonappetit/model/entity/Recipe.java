package com.bonappetit.model.entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
public class Recipe extends BaseEntity {


    @Column(nullable = false)
    @Size(min = 2, max = 40)
    private String name;

    @Column(nullable = false)
    @Size(min = 2, max = 150)
    private String ingredients;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User addedBy;

    @ManyToMany(mappedBy = "favouriteRecipes", fetch = FetchType.EAGER)
    private Set<User> favoriteByUsers;

    public Recipe() {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Set<User> getFavoriteByUsers() {
        return favoriteByUsers;
    }

    public void setFavoriteByUsers(Set<User> favoriteByUsers) {
        this.favoriteByUsers = favoriteByUsers;
    }
}
