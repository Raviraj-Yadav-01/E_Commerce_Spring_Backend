package com.example.ecommercespring.CategoryController;

import com.example.ecommercespring.dto.ProductDTO;

import com.example.ecommercespring.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.io.IOException;
import java.util.List;

@RestController   /// These are build from two things @Controller + @ResponseBody
@RequestMapping("/api/products")
public class ProductController {

    /// reference Sharing
    private final IProductService productService;

    /// Constructor based dependency Injections
    ProductController(IProductService productService){
        this.productService = productService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") Long id) throws IOException {

        ProductDTO response = this.productService.getProductById(id);
        return ResponseEntity.ok(response);
    }

}


/// 1. ResponseEntity -> ResponseEntity represents the whole HTTP response: status code, headers, and body.
/// As a result, we can use it to fully configure the HTTP response.