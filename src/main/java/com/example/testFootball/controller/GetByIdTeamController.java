package com.example.testFootball.controller;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.exceptions.TeamNotFoundException;
import com.example.testFootball.service.GetTeamByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class GetByIdTeamController {
    private final GetTeamByIdService getByIdService;

    @GetMapping("/getById/{id}")
    public ResponseEntity<TeamDTO> getTeamDTOById(@PathVariable Long id) {
        return new ResponseEntity<>(getByIdService.getTeamDTOById(id), HttpStatus.OK);
    }

    @ExceptionHandler(TeamNotFoundException.class)
    public ResponseEntity<String> handleInvalidInitialStatusException(final RuntimeException exception) {

        return ResponseEntity.
                status(HttpStatus.NOT_FOUND).
                body(exception.getMessage());
    }
}
