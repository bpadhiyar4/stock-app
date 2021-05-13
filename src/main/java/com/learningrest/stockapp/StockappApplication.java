package com.learningrest.stockapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Stock Market API",
		version = "1.0",
		description = "API for the stock market",
		contact = @Contact(
			email = "bpadhiyar4@gmail.com",
			name = "Bharat Padhiyar"
		)
	)
)
public class StockappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockappApplication.class, args);
	}

}
