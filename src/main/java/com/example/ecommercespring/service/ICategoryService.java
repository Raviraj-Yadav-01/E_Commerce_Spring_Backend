package com.example.ecommercespring.service;
import com.example.ecommercespring.dto.CategoryDTO;

import java.io.IOException;
import java.util.List;



public interface ICategoryService {

     List<CategoryDTO> getAllCategories() throws IOException;


}
