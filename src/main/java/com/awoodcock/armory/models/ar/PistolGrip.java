package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class PistolGrip extends AbstractEntity {

    // PROPERTIES
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

    public boolean isHasCompartment() {
        return hasCompartment;
    }

    public void setHasCompartment(boolean hasCompartment) {
        this.hasCompartment = hasCompartment;
    }
}
