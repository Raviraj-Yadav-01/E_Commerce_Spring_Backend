/*

package com.example.EcommerceSpring.entity;

/// It will Import jpa Annotations like @Id, @Column etc
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
/// Instant class from java Time Api > represent the timestamp in UTC
import java.time.Instant;


/// In jpa Annotations  used to defined the base class that contain the common fields
/// which will be mapped and inherited into child entity
/// Unlike entity > it does not get its own table

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class BaseEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  ///  it will create Primary ides
    private Long id;


    @CreatedDate
    @Column(nullable=false, updatable=false)
    private Instant createdAt;


    @LastModifiedDate
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
