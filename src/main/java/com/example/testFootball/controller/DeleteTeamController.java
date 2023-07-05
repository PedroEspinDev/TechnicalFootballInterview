package com.example.testFootball.controller;

import com.example.testFootball.exceptions.TeamNotFoundException;
import com.example.testFootball.service.DeleteTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class DeleteTeamController {
    private final DeleteTeamService deleteService;

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTeamById(@PathVariable Long id) {
        deleteService.deleteById(id);
    }

    @ExceptionHandler(TeamNotFoundException.class)
    public ResponseEntity<String> handleInvalidInitialStatusException(final TeamNotFoundException exception) {

        return ResponseEntity.
                status(HttpStatus.NOT_FOUND).
                body(exception.getMessage());
    }
}