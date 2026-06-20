/*
package com.example.ecommercespring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, updatable=false)
    private Instant createdAt;

    @Column(nullable=false)
    private Instant updatedAt;

    @PrePersist
    public void onCreate(){
        Instant now = Instant.now();
        this.createdAt = now;
        this.updatedAt = now;
    }

    @PreUpdate
    public void onUpdate(){
        this.updatedAt = Instant.now();
    }
}
*/
