package com.idat.kevinramirez.Turista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfKevinramirezTuristaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfKevinramirezTuristaApplication.class, args);
	}

}
