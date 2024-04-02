package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Trig extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "trig")
    private final List<AR> ARs = new ArrayList<>();

    private int pullWeight;

    // CONSTRUCTORS
    public Trig(){}

    public Trig(int pullWeight) {
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
