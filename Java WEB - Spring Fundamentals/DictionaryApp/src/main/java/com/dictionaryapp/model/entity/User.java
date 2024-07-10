package com.dictionaryapp.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.*;

import java.util.List;

@Entity
public class User extends BaseEntity {


    @Column(unique = true, nullable = false)
    @Size(min = 3, max = 20)
    private String username;

    @Column(nullable = false)
    @Size(min = 3, max = 200)
    private String password;


    @Column(unique = true, nullable = false)
    @Email
    private String email;

    @OneToMany(mappedBy = "addedBy", cascade = CascadeType.ALL)
    private List<Word> addedWords;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Word> getAddedWords() {
        return addedWords;
    }

    public void setAddedWords(List<Word> addedWords) {
        this.addedWords = addedWords;
    }
}
