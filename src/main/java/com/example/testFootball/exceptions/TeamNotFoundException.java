package com.example.testFootball.exceptions;

public class TeamNotFoundException extends RuntimeException {
    public TeamNotFoundException(String message) {
        super("No entity found with that id");
    }
}
