package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TeamService {
    private final ITeamRepository teamRepository;

    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }
    public Team getTeamById(Long id) {
        return teamRepository.findById(id).get();
    }
    public void deleteTeamById(Long id) {
        teamRepository.deleteById(id);
    }
}
