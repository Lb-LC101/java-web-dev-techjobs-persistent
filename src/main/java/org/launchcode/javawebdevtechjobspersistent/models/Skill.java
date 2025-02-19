package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    // Class variables

    @NotBlank(message = "Description is required")
    @Size(min = 5, max = 255, message = "Skill description must be between 5 and 255 characters")
    private String description;


    //this is not working
    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

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

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}