package com.project.abcinstitute.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


    @Entity
    @Table(name = "student_has_program")
    public class StudentProgram {
    
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name =  "id")
        private int id;
        
        @Column(name =  "student_student_id")
        private String student_student_id;
        
        @Column(name =  "program_program_id")
        private String program_program_id;

        @Column(name =  "register_date")
        private String register_date;


    public String getStudent_student_id() {
        return student_student_id;
    }

    public void setStudent_student_id(String student_student_id) {
        this.student_student_id = student_student_id;
    }

    public String getProgram_program_id() {
        return program_program_id;
    }

    public void setProgram_program_id(String program_program_id) {
        this.program_program_id = program_program_id;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

        
                 
}
