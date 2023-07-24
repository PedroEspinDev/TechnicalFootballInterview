package com.example.testFootball.mapper;

import com.example.testFootball.dto.TeamDTO;
import com.example.testFootball.entity.Team;
import org.mapstruct.Mapper;
<<<<<<< HEAD
import org.mapstruct.Mapping;
=======
>>>>>>> 9099d80 (Fix bugs and implement class update)
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ITeamMapper {
    TeamDTO entityToDto(Team entity);
    Team dtoToEntity(TeamDTO dto);
    List<Team> dtoToEntityList(List<TeamDTO> dto);

    List<TeamDTO> entityToDtoList(List<Team> entity);

    ITeamMapper INSTANCE = Mappers.getMapper(ITeamMapper.class);

}
