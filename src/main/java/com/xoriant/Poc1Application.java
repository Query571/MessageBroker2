package com.xoriant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Poc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Poc1Application.class, args);
	}

}
