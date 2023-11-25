package com.example.test.model.mappers;

import com.example.test.model.dto.ProductRequestDTO;
import com.example.test.model.dto.ProductResponseDTO;
import com.example.test.model.entities.Category;
import com.example.test.model.entities.Product;

public class ProductMapper {

    public static Product   fromProductRequestDTOToProduct(ProductRequestDTO productRequestDTO) {
        return new Product().builder()
                .name(productRequestDTO.name())
                .description(productRequestDTO.description())
                .price(productRequestDTO.price())
                .status(productRequestDTO.status())
                .category(
                        Category.builder()
                        .id(productRequestDTO.category_id())
                        .build()
                )
                .build();
    }
    public static ProductResponseDTO   fromProductToProductResponseDTO(Product product){
        return  new ProductResponseDTO(product.getName(),product.getDescription(),product.getPrice(),product.getCategory().getName());
    }
}
