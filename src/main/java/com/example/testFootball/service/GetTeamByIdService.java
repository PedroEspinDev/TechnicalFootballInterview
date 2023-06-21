package com.example.testFootball.service;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.mapper.TeamMapper;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetTeamByIdService {
    private final ITeamRepository teamRepository;

    public TeamDTO getTeamDTOById(Long id) {
        return TeamMapper.INSTANCE.
                teamToTeamDto(teamRepository.findById(id).get());
    }
}
