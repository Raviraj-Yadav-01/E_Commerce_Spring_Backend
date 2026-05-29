package com.example.EcommerceSpring.controllers;


import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.services.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProductService productService;

    ProductController(IProductService productService){
        this.productService = productService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable int id) throws IOException {

        ProductDTO response = this.productService.getProductById(id);

        return ResponseEntity.ok(response);
    }


}
