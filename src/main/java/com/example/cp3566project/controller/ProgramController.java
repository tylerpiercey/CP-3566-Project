package com.example.cp3566project.controller;

import com.example.cp3566project.model.Program;
import com.example.cp3566project.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/program")
public class ProgramController {

    @Autowired
    private ProgramRepository programRepository;

    @PostMapping
    public Program addProgram(@RequestBody Program program) {
        return programRepository.save(program);
    }

    @GetMapping
    public List<Program> getAllPrograms() {
        return programRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Program> getProgramById(@PathVariable Long id) {
        return programRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Program> updateProgram(@PathVariable Long id, @RequestBody Program programDetails) {
        return programRepository.findById(id)
                .map(program -> {
                    program.setProgramName(programDetails.getProgramName());
                    program.setCampus(programDetails.getCampus());
                    return ResponseEntity.ok(programRepository.save(program));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProgram(@PathVariable Long id) {
        return programRepository.findById(id)
                .map(program -> {
                    programRepository.delete(program);
                    return ResponseEntity.ok().build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
