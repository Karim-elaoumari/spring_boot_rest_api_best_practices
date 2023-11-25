package com.example.test.service.impl;

import com.example.test.model.dto.CategoryDTO;
import com.example.test.model.entities.Category;
import com.example.test.model.mappers.CategoryMapper;
import com.example.test.repository.CategoryRepository;
import com.example.test.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Optional<Category> findCategoryById(Long id){
        return categoryRepository.findById(id);
    }
}
