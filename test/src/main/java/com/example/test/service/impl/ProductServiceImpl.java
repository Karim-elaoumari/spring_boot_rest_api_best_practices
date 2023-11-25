package com.example.test.service.impl;

import com.example.test.model.dto.ProductRequestDTO;
import com.example.test.model.dto.ProductResponseDTO;
import com.example.test.model.entities.Category;
import com.example.test.model.entities.Product;
import com.example.test.model.mappers.CategoryMapper;
import com.example.test.model.mappers.ProductMapper;
import com.example.test.repository.CategoryRepository;
import com.example.test.repository.ProductRepository;
import com.example.test.service.CategoryService;
import com.example.test.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryService categoryService;

    @Override
    public Product saveProduct(Product product){
        final Product toSave = product;
        categoryService.findCategoryById(product.getCategory().getId()).ifPresent(
                c->{
                    toSave.setCategory(c);
                    productRepository.save(toSave);
                }
        );
        return product;
    }
}
