package com.example.testFootball.controller;

import com.example.testFootball.entity.Team;
import com.example.testFootball.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class TeamController {
    private final TeamService teamService;

    @PostMapping("/createTeam")
    public ResponseEntity<String> createTeam(@Valid @RequestBody Team team) {

        return null;
    }

    @GetMapping("/getAllTeams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/getTeamById/{id}")
    public ResponseEntity<Team> getTeamById(@PathVariable Long id) {
        return new ResponseEntity<>(teamService.getTeamById(id), HttpStatus.OK);
    }

    @GetMapping("/deleteTeam/{id}")
    public ResponseEntity<String> deleteTeamById(@PathVariable Long id) {
        teamService.deleteTeamById(id);
        return ResponseEntity.ok("Team " + id + " deleted successfully");
    }
}