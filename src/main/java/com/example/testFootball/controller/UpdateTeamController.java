package com.example.testFootball.controller;

import com.example.testFootball.entity.Team;
import com.example.testFootball.exceptions.TeamNotFoundException;
import com.example.testFootball.resources.TeamResource;
import com.example.testFootball.service.CreateTeamService;
import com.example.testFootball.service.UpdateTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class UpdateTeamController {
    private final UpdateTeamService updateTeamService;
    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTeam(@PathVariable Long id, @Valid @RequestBody TeamResource teamResource) {
    updateTeamService.update(id,teamResource);

    }
    @ExceptionHandler(TeamNotFoundException.class)
    public ResponseEntity<String> handleInvalidInitialStatusException(final RuntimeException exception) {

        return ResponseEntity.
                status(HttpStatus.NOT_FOUND).
                body(exception.getMessage());
    }
}
