package com.paintingscollectors.model.dto;

import com.google.gson.annotations.Expose;
import com.paintingscollectors.model.entity.StyleEnum;

import javax.validation.constraints.NotBlank;

public class StyleSeedDto {

    @Expose
    @NotBlank
    private String styleName;

    @Expose
    @NotBlank
    private String description;

    public StyleSeedDto() {
    }

    public String getStyleName() {
        return styleName;
    }

    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
