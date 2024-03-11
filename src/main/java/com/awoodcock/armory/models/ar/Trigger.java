package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class Trigger extends AbstractEntity {

    // PROPERTIES
    private int pullWeight;

    // CONSTRUCTORS
    public Trigger(){}

    public Trigger(int pullWeight) {
        super();
        this.pullWeight = pullWeight;
    }

    // GETTERS AND SETTERS
    public int getPullWeight() {
        return pullWeight;
    }

    public void setPullWeight(int pullWeight) {
        this.pullWeight = pullWeight;
    }
}
