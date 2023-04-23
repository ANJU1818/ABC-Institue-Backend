package com.project.abcinstitute.service;

import com.project.abcinstitute.model.Student;
import com.project.abcinstitute.repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(String studentId, Student student) {
        Student existingStudent = studentRepository.findById(studentId).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(student.getName());
            existingStudent.setAddress(student.getAddress());
            existingStudent.setContact(student.getContact());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(String studentId) {
        studentRepository.deleteById(studentId);
    }

    public Student getStudentById(String studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
     
    public List<Student> getAllStudents(int page, int size) {
        Pageable paging = (Pageable) PageRequest.of(page, size, Sort.by("studentId"));
        Page<Student> pagedResult = studentRepository.findAll(paging);
        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Student>();
        }
    }


}

