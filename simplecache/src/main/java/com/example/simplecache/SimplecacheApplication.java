package com.example.simplecache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SimplecacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplecacheApplication.class, args);
	}

}
