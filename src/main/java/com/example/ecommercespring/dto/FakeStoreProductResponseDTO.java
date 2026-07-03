package com.example.ecommercespring.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductResponseDTO {

    private Long id;
    private String category;
    private String title;
    private String description;
    private String image;
    private Double price;
    private Rating rating;


}
