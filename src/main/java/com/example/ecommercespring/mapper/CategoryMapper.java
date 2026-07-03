package com.example.ecommercespring.mapper;

import com.example.ecommercespring.dto.CategoryDTO;
import com.example.ecommercespring.entity.Category;

public class CategoryMapper {

    public static CategoryDTO toDto(Category entity) {
        return CategoryDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }

    public static Category toEntity(CategoryDTO dto) {
        return Category.builder()
                .name(dto.getName())
                .build();
    }
}
