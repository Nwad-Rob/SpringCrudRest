package com.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.restapi.model")
public class SpringCurdRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCurdRestApplication.class, args);
	}

}
