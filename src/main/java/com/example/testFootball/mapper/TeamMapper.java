package com.example.testFootball.mapper;

import com.example.testFootball.entity.Team;
import com.example.testFootball.resources.TeamResource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TeamMapper {

    public Team map (Team team, TeamResource teamResource) {
        if (null == team || null == teamResource){
            return team;
        }

        team.setName(teamResource.getName());
        team.setCity(teamResource.getCity());
        team.setOwner(teamResource.getOwner());
        team.setStadiumCapacity(team.getStadiumCapacity());
        team.setDivision(teamResource.getDivision());
        team.setCompetition(teamResource.getCompetition());
        team.setNumberOfPlayers(teamResource.getNumberOfPlayers());

        return team;
    }
}
