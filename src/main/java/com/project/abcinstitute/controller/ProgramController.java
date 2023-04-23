package com.project.abcinstitute.controller;

import com.project.abcinstitute.model.Program;
import com.project.abcinstitute.service.ProgramService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/programs")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @GetMapping("/{id}")
    public ResponseEntity<Program> getProgramById(@PathVariable(value = "id") String programId) {
        Program program = programService.getProgramById(programId);
        if (program == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(program);
    }

    @PostMapping("/add")
    public Program createProgram(@RequestBody Program program) {
        return programService.saveProgram(program);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Program> updateProgram(@PathVariable(value = "id") String programId, @RequestBody Program program) {
        Program updatedProgram = programService.updateProgram(programId, program);
        if (updatedProgram == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(updatedProgram);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProgram(@PathVariable(value = "id") String programId) {
        programService.deleteProgram(programId);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/search")
    public ResponseEntity<Program> searchProgramById(@RequestParam(value = "programId") String programId) {
        Program program = programService.getProgramById(programId);
        if (program == null) {
            return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok().body(program);
    } 

    @GetMapping
    public List<Program> getAllPrograms(
            @RequestParam(value="page", defaultValue = "0") int page,
            @RequestParam(value="size", defaultValue = "5") int size) {
        return programService.getAllPrograms(page, size);
    }
}


