package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.exceptions.TeamNotFoundException;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteTeamService {
    private final ITeamRepository teamRepository;

    public void deleteById(Long id) {
        Team team = teamRepository.
                findById(id).orElseThrow(
                        () -> new TeamNotFoundException("No entity found with that id")
                );
        teamRepository.deleteById(id);
    }
}
