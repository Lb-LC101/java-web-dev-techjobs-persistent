package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;

@Entity
public class Job extends AbstractEntity{

//    @Id
//    @GeneratedValue
//    private int id;

   // private String name;
    @ManyToOne
    private Employer employer;


    private String skills;

    public Job() {
    }

//    public Job(String anEmployer, String someSkills) {
//        super();
//        this.employer = employer;
//        this.skills = someSkills;
 //   }

    public Job(Employer employer, String skills) {
        this.employer = employer;
        this.skills = skills;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
