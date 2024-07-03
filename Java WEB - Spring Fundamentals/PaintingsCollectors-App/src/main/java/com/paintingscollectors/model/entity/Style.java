package com.paintingscollectors.model.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "styles")
public class Style extends BaseEntity{


    @Column(unique = true, nullable = false)
    @Enumerated(EnumType.STRING)
    private StyleEnum styleName;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "style", fetch = FetchType.EAGER)
    private Set<Painting> paintings;

    public Style() {
    }

    public StyleEnum getStyleName() {
        return styleName;
    }

    public void setStyleName(StyleEnum styleName) {
        this.styleName = styleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Painting> getPaintings() {
        return paintings;
    }

    public void setPaintings(Set<Painting> paintings) {
        this.paintings = paintings;
    }

    public String getStyleNameString(){
        return this.styleName.toString();
    }

    public void setStyleNameString(String styleName){
        this.styleName = StyleEnum.valueOf(styleName);
    }
}
