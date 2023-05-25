package com.example.testFootball.service;

import com.example.testFootball.dto.TeamDto;

public interface ITeamDtoRepository {
    public TeamDto createTeam(TeamDto teamDto);
}
