package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class ChargingHandle extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "chargingHandle")
    private final List<AR> ARs = new ArrayList<>();

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
