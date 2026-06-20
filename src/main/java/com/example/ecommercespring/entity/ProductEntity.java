/*
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
public class ProductEntity extends BaseEntity {

    private String title;

    @Column(length = 1000)
    private String description;

    private String image;
    private String category;
    private Double price;

    @Embedded // Isse aapka purana 'JdbcType' waala error solve ho jayega
    private Rating rating;
}
*/
