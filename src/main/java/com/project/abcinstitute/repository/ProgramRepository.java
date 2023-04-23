package com.project.abcinstitute.repository;

import com.project.abcinstitute.model.Program;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProgramRepository extends JpaRepository<Program, String>{

    public void deleteById(String id);

    public Page<Program> findAll(Pageable paging);

}