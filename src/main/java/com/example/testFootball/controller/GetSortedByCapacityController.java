package com.example.testFootball.controller;

import com.example.testFootball.entity.Team;

import com.example.testFootball.service.GetSortedByCapacityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/team")
@Validated
public class GetSortedByCapacityController {
    private final GetSortedByCapacityService getSortedByCapacityService;

    @GetMapping("/getAllByCapacity")
    public ResponseEntity<List<Team>> getTeamsSortedByCapacity() {
        return ResponseEntity.ok(getSortedByCapacityService.sortedTeamsByCapacity());
    }
}
