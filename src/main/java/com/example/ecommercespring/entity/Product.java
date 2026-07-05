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

    private String description;

    private String image;

    private Double price;

    @Embedded ///This is why because rating ha two more attributes that is rate and count
    private Rating rating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryID", nullable = false)
    private Category category;

}
