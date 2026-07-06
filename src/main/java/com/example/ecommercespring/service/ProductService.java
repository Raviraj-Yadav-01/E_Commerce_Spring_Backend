package com.example.ecommercespring.service;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.dto.ProductWithCategoryDTO;
import com.example.ecommercespring.entity.Category;
import com.example.ecommercespring.entity.Product;
import com.example.ecommercespring.exception.ProductNotFoundException;
import com.example.ecommercespring.mapper.ProductMapper;
import com.example.ecommercespring.repository.CategoryRepository;
import com.example.ecommercespring.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

@Service
public class ProductService implements IProductService{

   /// Referenced Sharing
   private final ProductRepository productRepository;
   private final CategoryRepository categoryRepository;

   /// Constructor Based Dependency Injection
   ProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
       this.productRepository = productRepository;
       this.categoryRepository = categoryRepository;
   }


   public ProductDTO getProductById(Long id) throws IOException{

       Product product = productRepository.findById(id)
               .orElseThrow(() -> new ProductNotFoundException("Product with ID "+ id + " not found"));
       return ProductMapper.toDto(product);
   }


   public ProductDTO createProduct(ProductDTO dto) throws IOException {

       Category category = categoryRepository.findById(dto.getCategoryId())
               .orElseThrow(() -> new IOException("Category not found"));

       Product saved = productRepository.save(ProductMapper.toEntity(dto, category));
       return ProductMapper.toDto(saved);
   }

    @Transactional
    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) throws IOException {
         Product product = productRepository.findById(id)
                 .orElseThrow(() -> new IOException("ProductWithCategory Not Found"));

         return ProductMapper.toProductWithCategoryDto(product);
    }


}
