package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.exceptions.TeamNotFoundException;
import com.example.testFootball.mapper.ITeamMapper;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateTeamService {

    private final ITeamRepository teamRepository;
    private final ITeamMapper teamMapper;

    public Team updateTeamById(Long id) throws TeamNotFoundException {
        Team existingTeam = teamRepository.
                findById(id).
                orElseThrow(() -> new TeamNotFoundException("No entity found with that id"));

        teamMapper.updateEntityFromDto(updateTeamDTO, existingTeam);
        return teamRepository.save(existingTeam);
    }
}
