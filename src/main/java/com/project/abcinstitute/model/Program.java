
package com.project.abcinstitute.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "program")
public class Program {
     @Id
    @Column(name =  "programId")
    private String programId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "duration")
    private String duration;
    
    @Column(name = "cost")
    private String cost;     

    public String getProgramId() {
        return programId;
    }

    public void setProgram_id(String programId) {
        this.programId = programId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Program() {
        
    }

    public Program(String name, String duration, String cost) {
        this.name = name;
        this.duration = duration;   
        this.cost = cost;
    }
    
}
