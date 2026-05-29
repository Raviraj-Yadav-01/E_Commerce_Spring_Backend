package com.example.EcommerceSpring.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Rating{
	private double rate;
	private int count;
}
