package com.example.testFootball.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class UpdateTeamDTO {

    @NotNull
    @NotBlank(message = "Name is required.")
    private String name;

    private String city;

    private String owner;

    @Positive
    private int stadiumCapacity;

    @Max(3)
    @Min(1)
    private Integer division;

    private String competition;

    private Integer numberOfPlayers;

}

