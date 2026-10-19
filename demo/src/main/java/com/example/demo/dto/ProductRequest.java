package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record ProductRequest(
    @NotBlank 
    String name, 
    @Positive 
    @NotNull 
    Double price,
    @PositiveOrZero 
    @NotNull 
    int stock
) {

}
