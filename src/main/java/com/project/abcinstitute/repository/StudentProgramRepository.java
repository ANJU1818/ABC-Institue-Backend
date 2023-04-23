package com.project.abcinstitute.repository;

import com.project.abcinstitute.model.StudentProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

  
@Repository
public interface StudentProgramRepository extends JpaRepository<StudentProgram, Integer>{
    
}
