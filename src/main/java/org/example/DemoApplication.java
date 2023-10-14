package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
	//destinations= side_of_road% 3A 55.7663444 % 2C 37.4412006 & origins= 51.7680296 % 2C 39.4375126
	//https://maps.googleapis.com/maps/api/distancematrix/json

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
