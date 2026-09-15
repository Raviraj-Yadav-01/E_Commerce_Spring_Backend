package com.example.EcommerceSpring.service;


import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.entity.Category;
import com.example.EcommerceSpring.mapper.CategoryMapper;
import com.example.EcommerceSpring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryService implements ICategoryService{


    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository){
        this.repository = repository;
    }


    @Override
    public CategoryDTO createCategory(CategoryDTO dto) throws IOException {
        Category saved = repository.save(CategoryMapper.toEntity(dto));
        return CategoryMapper.toDto(saved);
    }

    @Override
    public CategoryDTO getCategoryByName(String name) throws IOException {
        Category category = repository.findByName(name)
                .orElseThrow(() -> new IOException("Category not found with name: " + name));

                return CategoryMapper.toDto(category);
    }

    @Override
    public List<CategoryDTO> getAllCategories(CategoryDTO dto) throws IOException {

        List<CategoryDTO> dtos = new ArrayList<>();
        for(Category category : repository.findAll()){
            Category response = repository.save(category);
            dtos.add(CategoryMapper.toDto(response));
        }
        return dtos;
    }


}















