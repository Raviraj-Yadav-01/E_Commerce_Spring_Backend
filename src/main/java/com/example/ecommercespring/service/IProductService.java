package com.example.ecommercespring.service;

import com.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.dto.ProductWithCategoryDTO;

import java.io.IOException;

public interface IProductService {

    ProductDTO getProductById(Long id) throws IOException;

    ProductDTO createProduct(ProductDTO dto)throws IOException;

    ProductWithCategoryDTO getProductWithCategory(Long id) throws IOException;

}
