package com.example.test.web.rest;

import com.example.test.model.dto.ProductRequestDTO;
import com.example.test.model.dto.ProductResponseDTO;
import com.example.test.model.entities.Category;
import com.example.test.model.entities.Product;
import com.example.test.service.ProductService;
import com.example.test.web.rest.vm.SaveProductVM;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductRest {
    private  final ProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody SaveProductVM saveProductVM){
        Product toSave = Product
                .builder()
                .name(saveProductVM.getName())
                .category(Category.builder().id(saveProductVM.getCategory()).build())
                .build();
        Product productResponseDTO = productService.saveProduct(toSave);
        return  new ResponseEntity<>(productResponseDTO, HttpStatus.OK);

    }

}
