package com.example.ecommercespring.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class CategoryDTO {

     private Long id;
     private String name;

}

/*
@Getter / @Setter: Piche background me automatic Java ke standard getter/setter methods bana deta hai taaki code lamba na dikhe.

@Builder: Yeh Builder Design Pattern implement karta hai.
 Iska fayda ye hai ki aap bina lamba constructor chalaye, readable format me object bana sakte hain,
jaise: CategoryDTO.builder().name("Electronics").build().

*/
