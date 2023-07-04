package com.example.testFootball.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.Date;

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

