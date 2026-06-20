package com.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Rating {

    private Double rate;
    private Integer count;
}
