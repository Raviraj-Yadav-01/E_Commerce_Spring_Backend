package com.example.EcommerceSpring.controller;


import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.service.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {


    private final ICategoryService categoryService;

    public CategoryController(ICategoryService categoryService){
        this.categoryService = categoryService;
    }


    @GetMapping
    public ResponseEntity<?> getCategories(@RequestParam(required = false) String name) throws IOException {

        if(name != null && !name.isBlank()){
            CategoryDTO categoryDTO = categoryService.getCategoryByName(name);
            return ResponseEntity.ok(categoryDTO);

        }else{
            List<CategoryDTO> response = categoryService.getAllCategories(new CategoryDTO());
            return ResponseEntity.ok(response);

        }
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO dto) throws IOException {
      return ResponseEntity.ok(categoryService.createCategory(dto));

    }
}
