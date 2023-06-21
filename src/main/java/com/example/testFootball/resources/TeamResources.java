package com.example.testFootball.resources;

import javax.validation.constraints.*;

public class TeamResources {

    @NotNull
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

