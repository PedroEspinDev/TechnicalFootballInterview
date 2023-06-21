package com.example.testFootball.repository;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.entity.Team;
import com.example.testFootball.resources.TeamResources;

import java.util.List;

public interface ITeamDtoRepository {
    public TeamDTO createTeam(TeamDTO teamDto);
}
