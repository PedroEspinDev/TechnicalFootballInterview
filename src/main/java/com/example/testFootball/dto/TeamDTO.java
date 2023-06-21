package com.example.testFootball.dto;

import com.example.testFootball.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamDTO {

    @NotNull
    @NotBlank(message = "Name is required.")
    private String name;

    @Positive
    private Integer stadiumCapacity;

    @Max(3)
    @Min(1)
    private Integer division;

}

