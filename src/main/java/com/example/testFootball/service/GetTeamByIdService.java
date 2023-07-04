package com.example.testFootball.service;

import com.example.testFootball.dto.TeamDTO;

import com.example.testFootball.entity.Team;
import com.example.testFootball.mapper.ITeamMapper;
import com.example.testFootball.repository.ITeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetTeamByIdService {
    private final ITeamRepository teamRepository;
    private final ITeamMapper teamMapper;

    public TeamDTO getTeamDTOById(Long id) {

        //TODO Modificar el .get por excepciones custom.
        Team team = teamRepository.findById(id).get();
        return teamMapper.entityToDto(team);
    }
}
