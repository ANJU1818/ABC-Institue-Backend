package com.project.abcinstitute.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    
    @Id
    @Column(name =  "student_id")
    private String student_id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "address")
    private String address;
    
    @Column(name = "contact")
    private String contact;     

    public Student() {
        
    }

    public Student(String name, String contact, String address) {
        this.name = name;
        this.address = address;   
        this.contact = contact;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
