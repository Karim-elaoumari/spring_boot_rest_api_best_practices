package com.example.test.model.mappers;

import com.example.test.model.dto.CategoryDTO;
import com.example.test.model.dto.CategoryServiceDTO;
import com.example.test.model.entities.Category;

public class CategoryMapper {
    public static Category fromCategoryDtoToCategory(CategoryDTO categoryDTO){
        return  new Category().builder()
                .name(categoryDTO.name())
                .build();
    }
    public static  CategoryDTO fromCategoryToCategoryDto(Category category){
        return  new CategoryDTO(category.getName());
    }

    public static Category fromCategoryDtoToCategoryForService(CategoryServiceDTO categoryServiceDTO){
        return  new Category().builder()
                .name(categoryServiceDTO.name())
                .id(categoryServiceDTO.id())
                .build();
    }
    public static CategoryServiceDTO fromCategoryToCategoryDtoFroService(Category category){
        return  new CategoryServiceDTO(category.getId(),category.getName());
    }
}
