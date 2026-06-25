package com.example.ecommercespring.service;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.entity.Product;
import com.example.ecommercespring.mapper.ProductMapper;
import com.example.ecommercespring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService implements IProductService{

    
   private final ProductRepository repo;

   ProductService(ProductRepository repo){
       this.repo = repo;
   }

   public ProductDTO getProductById(Long id) throws IOException{
/*       return repo.findById(id)
               .map(ProductMapper::toDto)
               .orElseThrow(() -> new IOException("Product not found"));*/

       Product product = repo.findById(id)
               .orElseThrow(() -> new IOException("Product not found"));
       ProductDTO dto = ProductMapper.toDto(product);
       return dto;
   }


   public ProductDTO createProduct(ProductDTO dto){
       Product saved = repo.save(ProductMapper.toEntity(dto));
       return ProductMapper.toDto(saved);
   }

}
