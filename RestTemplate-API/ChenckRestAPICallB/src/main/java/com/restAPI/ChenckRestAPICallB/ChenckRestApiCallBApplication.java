package com.restAPI.ChenckRestAPICallB;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplateHandler;

@SpringBootApplication
public class ChenckRestApiCallBApplication {
	
/*	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
		
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(ChenckRestApiCallBApplication.class, args);
	}

	
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder){
		UriTemplateHandler url=new RootUriTemplateHandler("http://localhost:8080/CheckRestTempApi");
		return builder
				.uriTemplateHandler(url)
				.setReadTimeout(Duration.ofMillis(10000))
				.build();
	}
}
