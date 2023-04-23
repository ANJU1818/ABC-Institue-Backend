package com.project.abcinstitute.service;

import com.project.abcinstitute.model.Program;
import com.project.abcinstitute.repository.ProgramRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    public Program saveProgram(Program program) {
        return programRepository.save(program);
    }

    public Program updateProgram(String programId, Program program) {
        Program existingProgram = programRepository.findById(programId).orElse(null);
        if (existingProgram != null) {
            existingProgram.setName(program.getName());
            existingProgram.setDuration(program.getDuration());
            existingProgram.setCost(program.getCost());
            return programRepository.save(existingProgram);
        }
        return null;
    }

    public void deleteProgram(String programId) {
        programRepository.deleteById(programId);
    }

    public Program getProgramById(String programId) {
        return programRepository.findById(programId).orElse(null);
    }
    
    public List<Program> getAllPrograms(int page, int size) {
        Pageable paging = (Pageable) PageRequest.of(page, size, Sort.by("programId"));
        Page<Program> pagedResult = programRepository.findAll(paging);
        if (pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Program>();
        }
    }
}


