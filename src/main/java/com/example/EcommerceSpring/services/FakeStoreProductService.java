package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;

    FakeStoreProductService(IProductGateway productGateway){
        this.productGateway = productGateway;
    }


    @Override
    public ProductDTO getProductById(int id) throws IOException {
        return this.productGateway.getProductById(id);
    }
}
