package com.example.testFootball.mapper;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);
    TeamDTO teamToTeamDto(Team team);
}
