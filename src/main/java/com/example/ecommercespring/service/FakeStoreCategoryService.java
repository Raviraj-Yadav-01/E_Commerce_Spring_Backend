package com.example.ecommercespring.service;
import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class   FakeStoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        //return List.of();
        return this.categoryGateway.getAllCategories();
    }
}