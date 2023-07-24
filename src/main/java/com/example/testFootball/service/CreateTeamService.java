package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class CreateTeamService {
    private final ITeamRepository teamRepository;
<<<<<<< HEAD
=======
    private final ITeamMapper teamMapper;
>>>>>>> 9099d80 (Fix bugs and implement class update)

    public Team save(Team team) {
        return teamRepository.save(team);
    }
}
