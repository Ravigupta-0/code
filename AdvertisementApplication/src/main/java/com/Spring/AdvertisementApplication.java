package com.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Spring.repository")
public class AdvertisementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvertisementApplication.class, args);
	}

}
