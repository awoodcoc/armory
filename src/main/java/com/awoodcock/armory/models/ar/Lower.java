package com.awoodcock.armory.models.ar;

import com.awoodcock.armory.models.AbstractEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Lower extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "lower")
    private final List<AR> ARs = new ArrayList<>();

    private String color;

    private boolean isComplete;

    // CONSTRUCTORS
    public Lower(){}

    public Lower (String color, boolean isComplete) {
        super();
        this.color = color;
        this.isComplete = isComplete;
    }

    // GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
