package com.example.ecommercespring.Controller;

import com.example.ecommercespring.dto.ProductDTO;

import com.example.ecommercespring.dto.ProductWithCategoryDTO;
import com.example.ecommercespring.service.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;


@RestController /// These are build from two things @Controller + @ResponseBody
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

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO dto) throws IOException{
       return ResponseEntity.ok(productService.createProduct(dto));
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ProductWithCategoryDTO> getProductWithCategoryDTO(@PathVariable("id") Long id) throws IOException {
        ProductWithCategoryDTO response = this.productService.getProductWithCategory(id);
        return ResponseEntity.ok(response);
    }

}

/// 1. ResponseEntity -> ResponseEntity represents the whole HTTP response: status code, headers, and body.
/// As a result, we can use it to fully configure the HTTP response.