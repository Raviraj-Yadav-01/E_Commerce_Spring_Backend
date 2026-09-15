package com.example.EcommerceSpring.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductWithCategoryDTO {

    private Long id;
    private String title;
    private String description;
    private String image;
    private Double price;
    private RatingDTO rating;

    private CategoryDTO category;

}
