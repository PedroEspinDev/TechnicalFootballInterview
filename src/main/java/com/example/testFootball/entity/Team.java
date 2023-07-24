package com.example.testFootball.entity;

import com.example.testFootball.validators.CapacityStadium;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "team")
@CapacityStadium
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @Past
    private Date creationDate;
}
