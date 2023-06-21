package com.example.testFootball.service;

import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeleteTeamService {
    private final ITeamRepository teamRepository;

    public void deleteById(Long id) {
        teamRepository.deleteById(id);
    }
}
