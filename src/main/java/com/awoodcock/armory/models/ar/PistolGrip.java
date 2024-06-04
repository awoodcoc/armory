package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PistolGrip extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "pistolGrip")
    private final List<AR> ARs = new ArrayList<>();

    private String texture;

    private String color;

    private boolean hasCompartment;

    // CONSTRUCTORS
    public PistolGrip(){}

    public PistolGrip(String texture, String color, boolean hasCompartment) {
        super();
        this.texture = texture;
        this.color = color;
        this.hasCompartment = hasCompartment;
    }

    // GETTERS AND SETTERS
    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasCompartment() {
        return hasCompartment;
    }

    public void setCompartment(boolean hasCompartment) {
        this.hasCompartment = hasCompartment;
    }
}
