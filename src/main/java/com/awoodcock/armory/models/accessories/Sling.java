package com.awoodcock.armory.models.accessories;

import com.awoodcock.armory.models.AbstractEntity;

public class Sling extends AbstractEntity {

    // PROPERTIES
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
