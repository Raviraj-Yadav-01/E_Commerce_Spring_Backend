package com.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {

    private String category;
    private String title;
    private String description;
    private String image;
    private Double price;
    private Rating rating;
}