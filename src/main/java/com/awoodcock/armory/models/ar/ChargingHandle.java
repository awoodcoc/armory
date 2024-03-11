package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class ChargingHandle extends AbstractEntity {

    // PROPERTIES
    private String color;

    private boolean isAbmi;

    // CONSTRUCTORS
    public ChargingHandle(){}

    public ChargingHandle(String color, boolean isAbmi){
        super();
        this.color = color;
        this.isAbmi = isAbmi;
    }

    // GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAbmi() {
        return isAbmi;
    }

    public void setAbmi(boolean abmi) {
        isAbmi = abmi;
    }
}
