package com.project.abcinstitute.service;

import com.project.abcinstitute.model.StudentProgram;
import com.project.abcinstitute.repository.StudentProgramRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentProgramService {
    
    @Autowired
    private StudentProgramRepository studentprogramRepository;

    public StudentProgram saveStudentProgram(StudentProgram studentProgram) {
        return studentprogramRepository.save(studentProgram);
    }

    public List<StudentProgram> getAllStudentsPrograms() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public StudentProgram getStudentProgramById(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
