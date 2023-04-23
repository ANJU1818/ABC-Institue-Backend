package com.project.abcinstitute.controller;

import com.project.abcinstitute.model.StudentProgram;
import com.project.abcinstitute.service.StudentProgramService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/studentsprograms")
public class StudentProgramController {

    @Autowired
    private StudentProgramService programService;

    @GetMapping("/")
    public List<StudentProgram> getAllStudentsPrograms() {
        return programService.getAllStudentsPrograms();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<StudentProgram> getStudentProgramById(@PathVariable(value = "id") String Id) {
        StudentProgram studentProgram = programService.getStudentProgramById(Id);
        if (studentProgram == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(studentProgram);
    }

    @PostMapping("/add")
    public StudentProgram createStudentProgram(@RequestBody StudentProgram studentProgram) {
        return programService.saveStudentProgram(studentProgram);
    }

}