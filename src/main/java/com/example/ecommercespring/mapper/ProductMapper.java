package com.example.ecommercespring.mapper;

import com.example.ecommercespring.dto.ProductWithCategoryDTO;
import com.example.ecommercespring.entity.Category;
import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.entity.Product;

public class ProductMapper {



    public static ProductDTO toDto(Product product){

        if(product == null) {
            return null;
        }
        return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .description(product.getDescription())
                .image(product.getImage())
                .price(product.getPrice())
                .rating(product.getRating())
                .categoryId(product.getCategory().getId())
                .build();
    }

    public static Product toEntity(ProductDTO dto, Category category){

        if(dto == null) {
           return null;
        }
        return Product.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .image(dto.getImage())
                .price(dto.getPrice())
                .rating(dto.getRating())
                .category(category)
                .build();
    }

    public static ProductWithCategoryDTO toProductWithCategoryDto(Product product){

        /// Null check
        if(product == null){
            return null;
        }

        return ProductWithCategoryDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .description(product.getDescription())
                .image(product.getImage())
                .price(product.getPrice())
                .rating(product.getRating())
                .category(CategoryMapper.toDto(product.getCategory()))
                .build();
    }
}



