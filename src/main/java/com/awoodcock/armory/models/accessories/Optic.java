package com.awoodcock.armory.models.accessories;

import com.awoodcock.armory.models.AbstractEntity;

public class Optic extends AbstractEntity {

    // PROPERTIES
    private String classification;

    private int magnification;

    // CONSTRUCTORS
    public Optic(){}

    public Optic(String classification, int magnification) {
        super();
        this.classification = classification;
        this.magnification = magnification;
    }


    // GETTERS AND SETTERS
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        this.magnification = magnification;
    }
}
