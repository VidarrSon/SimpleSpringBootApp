package com.example.Train2Middle;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Train2MiddleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Train2MiddleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello world");
	}
}
