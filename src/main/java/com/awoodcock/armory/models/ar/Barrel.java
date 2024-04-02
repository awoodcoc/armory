package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Barrel extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "barrel")
    private final List<AR> ARs = new ArrayList<>();

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
