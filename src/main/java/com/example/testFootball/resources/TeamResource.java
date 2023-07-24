package com.example.testFootball.resources;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Builder
@Getter
@Setter
public class TeamResource {

    @NotBlank(message = "Name is required.")
    private String name;

    private String city;

    private String owner;

    @Positive
    private Integer stadiumCapacity;

    @Max(3)
    @Min(1)
    private Integer division;

    private String competition;

    private Integer numberOfPlayers;
}

