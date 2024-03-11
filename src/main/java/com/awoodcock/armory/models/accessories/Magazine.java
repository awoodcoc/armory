package com.awoodcock.armory.models.accessories;

import com.awoodcock.armory.models.AbstractEntity;

public class Magazine extends AbstractEntity {

    // PROPERTIES
    private int capacity;

    private int numMags;

    // CONSTRUCTORS
    public Magazine(){}

    public Magazine(int capacity, int numMags) {
        super();
        this.capacity = capacity;
        this.numMags = numMags;
    }

    // GETTERS AND SETTERS
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumMags() {
        return numMags;
    }

    public void setNumMags(int numMags) {
        this.numMags = numMags;
    }
}
