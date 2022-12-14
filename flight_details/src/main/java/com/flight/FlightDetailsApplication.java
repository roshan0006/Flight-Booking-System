package com.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;





@SpringBootApplication
@EnableEurekaClient

public class FlightDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightDetailsApplication.class, args);
	}

}
