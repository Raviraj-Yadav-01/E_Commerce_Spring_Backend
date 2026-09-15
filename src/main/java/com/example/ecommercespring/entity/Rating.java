package com.example.EcommerceSpring.entity;

import jakarta.persistence.Embeddable;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Rating {

    private Double rate;
    private Integer count;
}