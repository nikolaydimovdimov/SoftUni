package com.paintingscollectors.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "paintings")
public class Painting extends BaseEntity{


    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false, length = 30)
    private String author;

    @ManyToOne
    @JoinColumn(name = "style_id", referencedColumnName =   "id", nullable = false)
    private Style style;

    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "id",nullable = false)
    private User owner;

    @Column(nullable = false, length = 150)
    private String imageUrl;

    @Column(nullable = false)
    private boolean isFavorite;

    @Column(nullable = false)
    private int votes;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_favorite_paintings",
    joinColumns=@JoinColumn(name = "painting_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"))
    private Set<User> usersFavorites;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_rated_paintings",
    joinColumns = @JoinColumn(name = "painting_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"))
    private Set<User> usersRated;

    public Painting() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public Set<User> getUsersFavorites() {
        return usersFavorites;
    }

    public void setUsersFavorites(Set<User> usersFavorites) {
        this.usersFavorites = usersFavorites;
    }

    public Set<User> getUsersRated() {
        return usersRated;
    }

    public void setUsersRated(Set<User> usersRated) {
        this.usersRated = usersRated;
    }
}
