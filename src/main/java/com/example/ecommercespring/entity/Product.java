package com.example.ecommercespring.entity;

import com.example.ecommercespring.dto.Rating;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Product extends BaseEntity {

    private String title;

    @Column(length = 1000)
    private String description;
    private String image;
    private String category;
    private Double price;

    @Embedded /// This is why because Taring ha two more attributes that is rate and count
    private Rating rating;


}
