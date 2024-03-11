package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class Barrel extends AbstractEntity {

    // PROPERTIES
    private int barrelLength;

    // CONSTRUCTORS
    public Barrel(){}

    public Barrel(int barrelLength) {
        super();
        this.barrelLength = barrelLength;
    }

    // GETTERS AND SETTERS
    public int getLength() {
        return barrelLength;
    }

    public void setLength(int length) {
        this.barrelLength = length;
    }
}
