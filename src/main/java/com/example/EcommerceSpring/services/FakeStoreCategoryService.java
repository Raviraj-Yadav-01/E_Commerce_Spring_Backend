package com.example.EcommerceSpring.services;


import com.example.EcommerceSpring.dto.CategoryDTO;
import com.example.EcommerceSpring.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class   FakeStoreCategoryService implements ICategoryService{

    /// Dependency Injection
    private final ICategoryGateway categoryGateway;

   FakeStoreCategoryService(@Qualifier("fakeStoreRestTemplateGateway") ICategoryGateway categoryGateway){
       this.categoryGateway = categoryGateway;
   }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        return this.categoryGateway.getAllCategories();
    }
}


