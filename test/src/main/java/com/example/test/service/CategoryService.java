package com.example.test.service;

import com.example.test.model.entities.Category;

import java.util.Optional;

public interface CategoryService {
    Optional<Category> findCategoryById(Long id);
}
