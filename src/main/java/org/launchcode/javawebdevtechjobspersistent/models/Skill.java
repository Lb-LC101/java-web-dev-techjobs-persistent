package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    // Class variables
    @NotBlank(message = "Name is required")
    @Size(min = 5, max = 255, message = "Skill description must be between 5 and 255 characters")
    private String skills;

    // Constructors
    public Skill() {}

    // Methods

    //getters and setters

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}