package com.example.ecommercespring.dto;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductWithCategoryDTO {

    private Long id;
    private Long categoryId;
    private String title;
    private String description;
    private String image;
    private Double price;
    private Rating rating;
    private CategoryDTO category;
}
