package com.example.testFootball.controller;

import com.example.testFootball.entity.Team;
import com.example.testFootball.service.GetAllTeamsService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class GetAllTeamsController {
    private final GetAllTeamsService getAllService;

    @GetMapping("/getAll")
    public List<Team> getTeams() {
        return getAllService.getAll();
    }
}
