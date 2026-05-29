package com.example.EcommerceSpring.services;

import com.example.EcommerceSpring.dto.ProductDTO;

import java.io.IOException;

public interface IProductService {

    ProductDTO getProductById(int id) throws IOException;
}
