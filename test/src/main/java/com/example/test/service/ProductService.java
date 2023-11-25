package com.example.test.service;

import com.example.test.model.dto.ProductRequestDTO;
import com.example.test.model.dto.ProductResponseDTO;
import com.example.test.model.entities.Product;

public interface ProductService {

     Product saveProduct(Product product);
}
