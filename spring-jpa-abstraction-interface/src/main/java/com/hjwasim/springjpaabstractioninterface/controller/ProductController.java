package com.hjwasim.springjpaabstractioninterface.controller;

import com.hjwasim.springjpaabstractioninterface.dto.ProductAbstraction;
import com.hjwasim.springjpaabstractioninterface.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<?> getProducts() {
        List<ProductAbstraction> productList = productRepository.findAllProductAbstraction();
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }
}
