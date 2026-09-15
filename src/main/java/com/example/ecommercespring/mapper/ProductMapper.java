package com.example.EcommerceSpring.mapper;

import com.example.EcommerceSpring.dto.ProductDTO;
import com.example.EcommerceSpring.dto.ProductWithCategoryDTO;
import com.example.EcommerceSpring.dto.RatingDTO;
import com.example.EcommerceSpring.entity.Product;
import com.example.EcommerceSpring.entity.Rating;


public class ProductMapper{

    public static ProductDTO toDto(Product product){

        return ProductDTO.builder()
                .id(product.getId())
                .title(product.getTitle())
                .description(product.getDescription())
                .image(product.getImage())
                .price(product.getPrice())
                .rating(
                        RatingDTO.builder()
                        .rate(product.getRating().getRate())
                        .count(product.getRating().getCount())
                        .build())
                .categoryName(product.getCategory().getName())
                .build();
    }

    public static Product toEntity(ProductDTO dto){

        return Product.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .image(dto.getImage())
                .price(dto.getPrice())
                .rating(Rating.builder()
                        .rate(dto.getRating().getRate())
                        .count(dto.getRating().getCount())
                        .build())
                .build();
    }

    public static ProductWithCategoryDTO toProductWithCategoryDTO(Product product){

        return ProductWithCategoryDTO.builder()
                .title(product.getTitle())
                .description(product.getDescription())
                .image(product.getImage())
                .price(product.getPrice())
                .category(CategoryMapper.toDto(product.getCategory()))
                .build();
    }
}













