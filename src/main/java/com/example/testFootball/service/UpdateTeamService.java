package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.exceptions.TeamNotFoundException;
import com.example.testFootball.mapper.TeamMapper;
import com.example.testFootball.repository.ITeamRepository;
import com.example.testFootball.resources.TeamResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateTeamService {

    private final ITeamRepository teamRepository;
    private final TeamMapper teamMapper;
    public void update(Long id,TeamResource teamResource) {

        Team team = teamRepository.
                findById(id).
                orElseThrow(() -> new TeamNotFoundException("No entity found with that id"));

        teamRepository.save(teamMapper.map(team, teamResource));
    }
}
