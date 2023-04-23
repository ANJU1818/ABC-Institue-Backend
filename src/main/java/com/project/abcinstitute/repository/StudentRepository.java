package com.project.abcinstitute.repository;

import com.project.abcinstitute.model.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

    public void deleteById(String id);

    public Page<Student> findAll(Pageable paging);

    
    
}
