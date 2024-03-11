package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;

public class BCG extends AbstractEntity {

    // PROPERTIES

    private String boltMaterial;

    private String finish;

    // CONSTRUCTORS
    public BCG(){}

    public BCG(String boltMaterial, String finish){
        super();
        this.boltMaterial = boltMaterial;
        this.finish = finish;
    }

    // GETTERS AND SETTERS

    public String getBoltMaterial() {
        return boltMaterial;
    }

    public void setBoltMaterial(String boltMaterial) {
        this.boltMaterial = boltMaterial;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }
}
