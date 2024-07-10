package com.dictionaryapp.model.dto;

import com.dictionaryapp.model.entity.LangugeEnum;
import com.google.gson.annotations.Expose;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class LanguageSeedDto {

    @Expose
    @NotNull
    private LangugeEnum languageName;

    @Expose
    @NotBlank
    private String description;

    public LanguageSeedDto() {
    }

    public LangugeEnum getLanguageName() {
        return languageName;
    }

    public void setLanguageName(LangugeEnum languageName) {
        this.languageName = languageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
