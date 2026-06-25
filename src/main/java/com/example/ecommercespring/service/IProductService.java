package com.example.ecommercespring.service;

import com.example.ecommercespring.dto.ProductDTO;
import java.io.IOException;

public interface IProductService {

    ProductDTO getProductById(Long id) throws IOException;

    ProductDTO createProduct(ProductDTO dto);


}
