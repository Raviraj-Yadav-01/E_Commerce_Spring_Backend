package com.example.ecommercespring.mapper;

import com.example.ecommercespring.dto.ProductDTO;
import com.example.ecommercespring.entity.Product;

public class ProductMapper {


    public static ProductDTO toDto(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .description(product.getDescription())
                .image(product.getImage())
                .price(product.getPrice())
                .rating(product.getRating())
                .category(product.getCategory())
                .build();
    }

    public static Product toEntity(ProductDTO dto){
        return Product.builder()

                .title(dto.getTitle())
                .description(dto.getDescription())
                .image(dto.getImage())
                .price(dto.getPrice())
                .rating(dto.getRating())
                .category(dto.getCategory())
                .build();
    }
}
