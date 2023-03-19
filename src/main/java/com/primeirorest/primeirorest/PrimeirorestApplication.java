package com.primeirorest.primeirorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.primeirorest"})
public class PrimeirorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirorestApplication.class, args);
	}

}
