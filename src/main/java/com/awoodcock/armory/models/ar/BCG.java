package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class BCG extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "bcg")
    private final List<AR> ARs = new ArrayList<>();

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
