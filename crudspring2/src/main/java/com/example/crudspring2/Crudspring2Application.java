package com.example.crudspring2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.crudspring2.controllers.RatingController;

@SpringBootApplication
@ComponentScan(basePackageClasses=RatingController.class)
public class Crudspring2Application {

	public static void main(String[] args) {
		SpringApplication.run(Crudspring2Application.class, args);
		
		
	}

}
