package com.example.ratingdataservicehystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RatingDataServiceHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceHystrixApplication.class, args);
	}

}
