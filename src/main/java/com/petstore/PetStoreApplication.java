package com.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@SpringBootApplication
@EnableWebMvc
@OpenAPIDefinition(info = @Info(title = "Pet Store App", version = "1.0", description = "Information About Pets in the Store"))
public class PetStoreApplication {
	  private static final Logger LOGGER = LogManager.getLogger(PetStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PetStoreApplication.class, args);
		
	}

}
