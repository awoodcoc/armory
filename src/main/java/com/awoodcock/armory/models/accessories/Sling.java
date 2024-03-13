package com.awoodcock.armory.models.accessories;

import com.awoodcock.armory.models.AbstractEntity;
import com.awoodcock.armory.models.ar.AR;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Sling extends AbstractEntity {

    // PROPERTIES
    @OneToMany(mappedBy = "sling")
    private final List<AR> ARs = new ArrayList<>();

    private int numPoints;

    private String attachmentMethod;

    // CONSTRUCTORS
    public Sling(){}

    public Sling(int numPoints, String attachmentMethod) {
        this.numPoints = numPoints;
        this.attachmentMethod = attachmentMethod;
    }

    // GETTERS AND SETTERS
    public int getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }

    public String getAttachmentMethod() {
        return attachmentMethod;
    }

    public void setAttachmentMethod(String attachmentMethod) {
        this.attachmentMethod = attachmentMethod;
    }
}
