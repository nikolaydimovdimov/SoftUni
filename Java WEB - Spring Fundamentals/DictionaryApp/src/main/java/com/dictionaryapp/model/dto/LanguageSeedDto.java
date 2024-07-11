package com.dictionaryapp.model.dto;

import com.dictionaryapp.model.entity.LanguageEnum;
import com.google.gson.annotations.Expose;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LanguageSeedDto {

    @Expose
    @NotNull
    private LanguageEnum languageName;

    @Expose
    @NotBlank
    private String description;

    public LanguageSeedDto() {
    }

    public LanguageEnum getLanguageName() {
        return languageName;
    }

    public void setLanguageName(LanguageEnum languageName) {
        this.languageName = languageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
