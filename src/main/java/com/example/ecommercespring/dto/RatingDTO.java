package com.example.EcommerceSpring.dto;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Embeddable
public class RatingDTO {

    private Double rate;
    private Integer count;

}
