package com.example.testFootball.controller;

import com.example.testFootball.dto.UpdateTeamDTO;
import com.example.testFootball.entity.Team;
import com.example.testFootball.exceptions.TeamNotFoundException;
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
    private final UpdateTeamDTO updateTeamDTO;
    private final CreateTeamService teamService;

    @PutMapping("/update/{id}")
        public ResponseEntity<String> updateTeam(@PathVariable Long id, @Valid @RequestBody UpdateTeamDTO updateTeamDTO) {
        Team existingTeam = updateTeamService.updateTeamById(id);

        existingTeam.setName(updateTeamDTO.getName());
        existingTeam.setCity(updateTeamDTO.getCity());
        existingTeam.setOwner(updateTeamDTO.getOwner());
        existingTeam.setStadiumCapacity(updateTeamDTO.getStadiumCapacity());
        existingTeam.setDivision(updateTeamDTO.getDivision());
        existingTeam.setCompetition(updateTeamDTO.getCompetition());
        existingTeam.setNumberOfPlayers(updateTeamDTO.getNumberOfPlayers());
        Team updatedTeam = teamService.save(existingTeam);

        return ResponseEntity.ok("Team updated successfully");
    }
    @ExceptionHandler(TeamNotFoundException.class)
    public ResponseEntity<String> handleInvalidInitialStatusException(final RuntimeException exception) {

        return ResponseEntity.
                status(HttpStatus.NOT_FOUND).
                body(exception.getMessage());
    }
}
