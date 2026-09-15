package com.example.EcommerceSpring.service;


import com.example.EcommerceSpring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {

    CategoryDTO createCategory(CategoryDTO dto) throws IOException;


    CategoryDTO getCategoryByName(String name) throws IOException;


    List<CategoryDTO> getAllCategories(CategoryDTO dto) throws IOException;

}
