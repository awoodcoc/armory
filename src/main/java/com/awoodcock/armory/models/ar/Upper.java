package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class Upper extends AbstractEntity {


    // PROPERTIES
    private String color;

    private boolean isComplete;

    // CONSTRUCTORS
    public Upper(){}

    public Upper (String color, boolean isComplete) {
        super();
        this.color = color;
        this.isComplete = isComplete;
    }

    // GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
