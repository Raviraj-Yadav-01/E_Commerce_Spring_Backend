package com.example.ecommercespring;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing  /// It does Activate the jpa Auditing features.
public class EcommerceSpringApplication {

	public static void main(String[] args) {

		// load environment file from .env file
		Dotenv dotenv = Dotenv.configure().load();

		// Set all .env variables as system properties
		dotenv.entries().forEach( entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(EcommerceSpringApplication.class, args);
	}
}





