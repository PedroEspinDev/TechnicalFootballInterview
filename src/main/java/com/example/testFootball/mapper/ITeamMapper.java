package com.example.testFootball.mapper;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ITeamMapper {

    @Mapping(target = "id", ignore = true)
    Team dtoToEntity(TeamDTO dto);

    TeamDTO entityToDto(Team entity);

    ITeamMapper INSTANCE = Mappers.getMapper(ITeamMapper.class);

}
