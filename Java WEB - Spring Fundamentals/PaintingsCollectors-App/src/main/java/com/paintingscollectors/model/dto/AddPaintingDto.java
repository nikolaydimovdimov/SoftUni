package com.paintingscollectors.model.dto;

import com.paintingscollectors.model.entity.Style;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AddPaintingDto {

    @NotBlank(message = "{paint.add.name.not.blank}")
    @Size(min = 5, max = 40,message = "{paint.add.name.length}")
    private String name;


    @NotBlank(message = "{paint.add.author.not.blank}")
    @Size(min = 5, max = 30,message = "{paint.add.author.length}")
    private String author;

    @NotBlank(message = "{paint.add.style.not.blank}")
    private String style;


    @NotBlank(message = "{paint.add.url.not.blank}")
    @Size(min = 2, max = 150, message = "{paint.add.url.length}")
    private String imageUrl;

    public AddPaintingDto() {
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
