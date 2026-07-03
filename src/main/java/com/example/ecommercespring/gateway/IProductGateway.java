package com.example.ecommercespring.gateway;

import com.example.ecommercespring.dto.FakeStoreProductResponseDTO;
import com.example.ecommercespring.dto.ProductDTO;

import java.io.IOException;
import java.util.List;


public interface IProductGateway {

    ProductDTO getProductById(Long id) throws IOException;

}
