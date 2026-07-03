package com.example.ecommercespring.service;
import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;

import java.io.IOException;
import java.util.List;



public interface ICategoryService {

      List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException;

      CategoryDTO createCategory(CategoryDTO categoryDTO) throws IOException;

      CategoryDTO getByName(String name) throws Exception;


}
