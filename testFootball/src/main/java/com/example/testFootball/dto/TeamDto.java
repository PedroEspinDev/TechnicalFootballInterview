package com.example.testFootball.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamDto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Invalid data, enter valid name.")
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

    private String creationDate;
}

