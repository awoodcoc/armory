package com.awoodcock.armory.models.accessories;

import com.awoodcock.armory.models.AbstractEntity;
import com.awoodcock.armory.models.ar.AR;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Magazine extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "magazine")
    private final List<AR> ARs = new ArrayList<>();
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
