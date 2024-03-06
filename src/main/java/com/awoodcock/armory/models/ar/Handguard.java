package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class Handguard extends AbstractEntity {

    // PROPERTIES
    private String mountingSystem;

    private boolean isFreeFloat;

    // CONSTRUCTORS
    public Handguard(){}

    public Handguard(String mountingSystem, boolean isFreeFloat) {
        super();
        this.mountingSystem = mountingSystem;
        this.isFreeFloat = isFreeFloat;
    }

    // GETTERS AND SETTERS
    public String getMountingSystem() {
        return mountingSystem;
    }

    public void setMountingSystem(String mountingSystem) {
        this.mountingSystem = mountingSystem;
    }

    public boolean isFreeFloat() {
        return isFreeFloat;
    }

    public void setFreeFloat(boolean freeFloat) {
        isFreeFloat = freeFloat;
    }
}
