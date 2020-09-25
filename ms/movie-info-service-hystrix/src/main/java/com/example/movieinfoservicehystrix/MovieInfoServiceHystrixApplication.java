package com.example.movieinfoservicehystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInfoServiceHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceHystrixApplication.class, args);
	}

}
