package com.example.EcommerceSpring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ProductDTO {

    private Long id;
    private String title;
    private String description;
    private String image;
    private Double price;
    private RatingDTO rating;
    private String categoryName;

}