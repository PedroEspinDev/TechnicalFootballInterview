package com.example.testFootball.service;

import com.example.testFootball.entity.Team;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class GetSortedByCapacityService {
    private final ITeamRepository teamRepository;

    public List<Team> sortedTeamsByCapacity() {
        return teamRepository.findAllByOrderByStadiumCapacityDesc();
    }

}
