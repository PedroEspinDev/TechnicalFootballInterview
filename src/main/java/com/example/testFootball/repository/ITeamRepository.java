package com.example.testFootball.repository;
import com.example.testFootball.entity.Team;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITeamRepository extends JpaRepository<Team,Long> {
    List<Team> findAllByOrderByStadiumCapacityDesc();
}


