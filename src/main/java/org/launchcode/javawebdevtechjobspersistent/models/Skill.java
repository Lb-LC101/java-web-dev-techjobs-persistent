package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    // Class variables

    @NotBlank(message = "Description is required")
    @Size(min = 5, max = 255, message = "Skill description must be between 5 and 255 characters")
    private String description;

    // Constructors
    public Skill() {}

    // Methods

    //getters and setters


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}