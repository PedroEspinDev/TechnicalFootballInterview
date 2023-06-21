package com.example.testFootball.controller;

import com.example.testFootball.service.DeleteTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class DeleteTeamController {
    private final DeleteTeamService deleteService;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTeamById(@PathVariable Long id) {
        deleteService.deleteById(id);
        return ResponseEntity.ok("Team " + id + " deleted successfully");
    }
}