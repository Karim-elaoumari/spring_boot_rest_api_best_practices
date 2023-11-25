package com.example.test.model.dto;

import com.example.test.model.enums.Status;

public record ProductRequestDTO(
        String name,
        String description,
        Double price,
        Long category_id,
        Status status
) {
}
