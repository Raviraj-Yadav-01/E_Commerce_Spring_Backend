package com.example.ecommercespring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;    /// Yeh Java ka modern Date-Time API hai jo nano-seconds tak ka accurate time zone (UTC) store karta hai. Industry me Date ya Timestamp ki jagah Instant use karna best standard hai.

@MappedSuperclass  /// Yeh Hibernate ko batata hai ki: "Main khud ek table nahi hoon, lekin jo bhi bacha-entity mujhe extends karega, mere saare database columns uski table me chupke se daal dena."
@Getter
@Setter
public class BaseEntity {   ///* Industry me ise Auditing Entity kehte hain. Iska kaam hota hai har table me common fields (jaise Primary Key, Kab data bana, kab update hua) ko control karna taaki hame har class me baar-baar same code na likhna pade. */

    @Id // @Id is column ko Primary Key banata hai.
    @GeneratedValue(strategy = GenerationType.IDENTITY) /// IDENTITY strategy MySQL ko bolti hai ki jab bhi naya product aaye, toh uski ID automatic sequentially barhao (1, 2, 3...), developer ko manually ID set karne ki jarurat nahi hai.
    private Long id;  ///1.


    @Column(nullable=false, updatable=false)  /// Database par strict rules lagata hai. nullable=false matlab ye field kabhi khali (null) nahi ho sakti. updatable=false matlab ek baar jab product ban gaya aur createdAt me time darj ho gaya, toh koi bhi use poori zindagi badal (update) nahi payega.
    private Instant createdAt;  ///2.


    @Column(nullable=false)
    private Instant updatedAt;   ///3.


    @PrePersist  /// Jab aap database me .save() chalakar pehli baar koi naya product insert karne wale hote hain, toh database me jaake store hone se thik pehle Hibernate is method ko automatic trigger kar deta hai. Yeh createdAt aur updatedAt dono me current live time stamp set kar deta hai.
    public void onCreate(){
        Instant now = Instant.now();
        this.createdAt = now;
        this.updatedAt = now;
    }


    @PreUpdate  /// Jab aap kisi purane product ka price ya title badal kar database me update karte hain, toh database write se thik pehle yeh hook chalta hai aur sirf updatedAt ka time badal kar naya time stamp kar deta hai, jabki createdAt purana hi rehta hai.
    public void onUpdate(){
        this.updatedAt = Instant.now();
    }


}
