package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class Stock extends AbstractEntity {

    // PROPERTIES
    private String color;

    private boolean isAdjustable;

    // CONSTRUCTORS
    public Stock(){}

    public Stock(String color, boolean isAdjustable) {
        super();
        this.color = color;
        this.isAdjustable = isAdjustable;
    }

    // GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAdjustable() {
        return isAdjustable;
    }

    public void setAdjustable(boolean adjustable) {
        isAdjustable = adjustable;
    }
}
