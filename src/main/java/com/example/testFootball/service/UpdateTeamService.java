package com.example.testFootball.service;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.entity.Team;
import com.example.testFootball.mapper.TeamMapper;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateTeamService {
    private final ITeamRepository teamRepository;
    private final GetTeamByIdService getTeamByIdService;
    private final CreateTeamService createTeamService;

    public Team updateTeam(Team team){
        return teamRepository.save(team);
    }
}

