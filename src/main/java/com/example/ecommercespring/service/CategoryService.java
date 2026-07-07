package com.example.ecommercespring.service;

import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.dto.FakeStoreCategoryResponseDTO;
import com.example.ecommercespring.entity.Category;
import com.example.ecommercespring.mapper.CategoryMapper;
import com.example.ecommercespring.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service("dbCategoryService")
public class CategoryService implements ICategoryService{

    /// Reference Sharing
    public final CategoryRepository categoryRepository;

    /// Constructor Based Dependency Injection
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<FakeStoreCategoryResponseDTO> getAllCategories() throws IOException {
        return null;
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) throws IOException {

        Category entity = new Category();
        entity.setName(categoryDTO.getName());

        // 2. Repository se database me save karwaya
        Category savedEntity = categoryRepository.save(entity);

        // 3. Saved data ko wapas DTO me convert kiya
        CategoryDTO result = new CategoryDTO();
        result.setId(savedEntity.getId());
        result.setName(savedEntity.getName());

        return result;
    }

    @Override
    public CategoryDTO getByName(String name) throws Exception {
        Category category = categoryRepository.findByName(name)
                .orElseThrow(() -> new Exception("category not found by their name :"+ name));

        return CategoryMapper.toDto(category);
    }
}
