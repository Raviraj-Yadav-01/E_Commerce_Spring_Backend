package com.example.ecommercespring.service;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.dto.ProductWithCategoryDTO;
import com.example.ecommercespring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService{

    /// Reference passing
    private final IProductGateway productGateway;
    /// Constructor dependency
    FakeStoreProductService(IProductGateway productGateway){
        this.productGateway = productGateway;
    }


    @Override
    public ProductDTO getProductById(Long id) throws IOException {
        return this.productGateway.getProductById(id);
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto){
        /// Not in use
        return null;
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) throws IOException {
        /// Not in use
        return null;
    }
}
