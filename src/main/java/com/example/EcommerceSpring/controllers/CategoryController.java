package com.example.EcommerceSpring.controllers;

import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController

@RequestMapping("/api/categories")
public class CategoryController {


      //  @Autowired Dependency Injection(field based)
     private final ICategoryService categoryService;

    // Dependency Injection (constructor based)
     CategoryController(ICategoryService _categoryService){
         this.categoryService = _categoryService;
     }


    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() throws IOException {

         List<CategoryDTO> response = this.categoryService.getAllCategories();
         return ResponseEntity.created(null).body(response);

    }
}
