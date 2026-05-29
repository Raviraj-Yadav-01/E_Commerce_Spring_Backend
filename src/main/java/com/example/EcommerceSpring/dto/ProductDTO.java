package com.example.EcommerceSpring.dto;


import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO{
	private String image;
	private double price;
	private Rating rating;
	private String description;
	private int id;
	private String title;
	private String category;
}
