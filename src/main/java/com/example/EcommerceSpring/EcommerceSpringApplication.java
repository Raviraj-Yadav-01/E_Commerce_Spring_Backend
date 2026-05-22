package com.example.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

    /// dotenv acts as a utility to load external environment variables from a local .env file into the Spring Environment context during local development.
    Dotenv dotenv = Dotenv.load();


   // dotenv.entries().forEach( entry ->System.setProperty(entry.getKey(), entry.getValue()));


    public static void main(String[] args) {
        SpringApplication.run(EcommerceSpringApplication.class, args);
    }

}
