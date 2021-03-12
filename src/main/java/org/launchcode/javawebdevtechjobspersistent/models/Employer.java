package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    // Class variables
    @NotBlank(message = "Location is required")
    @Size(min = 5, max = 50, message = "Location must be between 5 and 50 characters")
    private String location;

    // Constructors
    public Employer() {}

    // Methods

    //getters and setters

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }



}
