package com.example.testFootball.controller;

import com.example.testFootball.entity.Team;
import com.example.testFootball.resources.TeamResources;
import com.example.testFootball.service.UpdateTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class UpdateTeamController {
    private final UpdateTeamService updateTeamService;

    @PutMapping("/update/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Team team) {
        Team teamToBeUpdated = updateTeamService.
        String teamModify = teamToBeUpdated.setName(team.getName());
        teamToBeUpdated.setCity(team.getCity());
        teamToBeUpdated.setOwner(team.getOwner());
        teamToBeUpdated.setStadiumCapacity(team.getStadiumCapacity());
        teamToBeUpdated.setDivision(team.getDivision());
        teamToBeUpdated.setCompetition(team.getCompetition());
        teamToBeUpdated.setNumberOfPlayers(team.getNumberOfPlayers());
        teamToBeUpdated.setCreationDate(team.getCreationDate());
        teamToBeUpdated = updateTeamService.updateTeam(team);
        return ResponseEntity.ok("Team "+id + " updated successfully!");
    }
}
