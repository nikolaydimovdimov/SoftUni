package com.dictionaryapp.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Language extends BaseEntity {


    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private LangugeEnum languageName;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "language", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Word> words;

    public Language() {
    }

    public void setLanguageName(LangugeEnum languageName) {
        this.languageName = languageName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public LangugeEnum getLanguageName() {
        return languageName;
    }

    public String getDescription() {
        return description;
    }

    public List<Word> getWords() {
        return words;
    }
}

// Getters and Setters
