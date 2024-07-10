package com.dictionaryapp.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Word extends BaseEntity {


    @Column(nullable = false)
    @Size(min = 2, max = 40)
    private String term;

    @Column(nullable = false)
    @Size(min = 2, max = 80)
    private String translation;

    @Column(nullable = false)
    @Size(min = 2, max = 200)
    private String example;

    @Column(nullable = false)
    private LocalDate inputDate;


    @ManyToOne
    @JoinColumn(name = "language_id",nullable = false)
    private Language language;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User addedBy;

    public Word() {
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public LocalDate getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }
}

