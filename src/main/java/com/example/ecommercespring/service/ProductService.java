package com.example.EcommerceSpring.service;


import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.example.EcommerceSpring.entity.Category;
import com.example.EcommerceSpring.entity.Product;
import com.example.EcommerceSpring.mapper.ProductMapper;
import com.example.EcommerceSpring.repository.CategoryRepository;
import com.example.EcommerceSpring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService implements IProductService {


    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }


    @Override
    public ProductDTO getProductById(Long id) throws Exception {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new Exception(" Product not found "));
    }

    @Override
    public ProductDTO createProduct(ProductDTO dto) throws Exception {

        Category category = categoryRepository.findByName(dto.getCategoryName())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        Product product = ProductMapper.toEntity(dto);

        product.setCategory(category);

        Product saved = productRepository.save(product);
        return ProductMapper.toDto(product);
    }

    @Override
    public ProductWithCategoryDTO getProductWithCategory(Long id) throws Exception {

        Product product = productRepository.findById(id)
                .orElseThrow(() -> new Exception("Product Not found"));
        return ProductMapper.toProductWithCategoryDTO(product);
    }

    @Override
    public List<ProductDTO> getAllProduct() throws Exception {
        List<ProductDTO> listOfProduct = new ArrayList<>();
        for(Product product : productRepository.findAll()){
            Product response = productRepository.save(product);
            listOfProduct.add(ProductMapper.toDto(product));
        }
        return listOfProduct;
    }

}
