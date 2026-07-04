package com.example.ecommercespring.repository;

import com.example.ecommercespring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    /// This is a Custom Query method using HQL. This is Explicitly define the Query logic
    @Query("Select p from Product p Where p.price > :minPrice")
    List<Product> findExpensiveProduct(@Param("minPrice") double minPrice);


     /// Native SQL Query
    @Query(value="Select * FROM Product WHERE MATCH(name, description) AGAINST (:keyword)", nativeQuery=true)
    List<Product> searchFullText(@Param("keyword") String keyword);


    @Query("Select p FROM Product p WHERE p.price > :minPrice AND p.price = :brand")
    List<Product> findByBrandAndPrice(
            @Param("minPrice") double price,
            @Param("brand") String brandName
    );
}
