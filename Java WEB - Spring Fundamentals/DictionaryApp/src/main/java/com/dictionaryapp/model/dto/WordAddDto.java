package com.dictionaryapp.model.dto;

import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.model.entity.LanguageEnum;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class WordAddDto {

    @NotNull(message = "{word.add.term.not.blank}")
    @Size(min = 2, max = 40,message = "{word.add.term.length}")
    private String term;

    @NotNull(message = "{word.add.translation.not.blank}")
    @Size(min = 2, max = 80,message = "{word.add.translation.length}")
    private String translation;

    @NotNull(message = "{word.add.example.not.blank}")
    @Size(min = 2, max = 200,message = "{word.add.example.length}")
    private String example;

    @NotNull(message = "{word.add.inputDate.not.blank}")
    @PastOrPresent(message = "{word.add.inputDate.time}")
    private LocalDate inputDate;


    @NotNull(message = "{word.add.language.not.blank}")
    private LanguageEnum languageEnum;

    public WordAddDto() {
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

    public LanguageEnum getLanguageEnum() {
        return languageEnum;
    }

    public void setLanguageEnum(LanguageEnum languageEnum) {
        this.languageEnum = languageEnum;
    }
}
