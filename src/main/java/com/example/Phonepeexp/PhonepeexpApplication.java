package com.example.Phonepeexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@SpringBootApplication
@EntityScan("com.example.Phonepeexp.*")
public class PhonepeexpApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonepeexpApplication.class, args);
	}

}
