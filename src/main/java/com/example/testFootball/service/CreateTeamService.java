package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.mapper.ITeamMapper;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class CreateTeamService {
    private final ITeamRepository teamRepository;
    private final ITeamMapper teamMapper;

    public Team save(Team team) {
        return teamRepository.save(team);
    }
}
