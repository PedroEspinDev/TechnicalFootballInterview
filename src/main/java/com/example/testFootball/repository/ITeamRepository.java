package com.example.testFootball.repository;

import com.example.testFootball.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ITeamRepository extends JpaRepository<Team, Long> {
}
