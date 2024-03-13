package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Stock extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "stock")
    private final List<AR> ARs = new ArrayList<>();

    private String color;

    private boolean isAdjustable;

    // CONSTRUCTORS
    public Stock(){}

    public Stock(String color, boolean isAdjustable) {
        super();
        this.color = color;
        this.isAdjustable = isAdjustable;
    }

    // GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAdjustable() {
        return isAdjustable;
    }

    public void setAdjustable(boolean adjustable) {
        isAdjustable = adjustable;
    }
}
