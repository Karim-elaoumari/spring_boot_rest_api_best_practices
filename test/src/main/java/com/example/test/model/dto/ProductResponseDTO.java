package com.example.test.model.dto;

import com.example.test.model.enums.Status;

public record ProductResponseDTO(
        String name,
        String description,
        Double price,
        String category_name
) {
}
