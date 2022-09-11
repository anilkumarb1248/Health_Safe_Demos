package com.healthsafe.app.provisioningservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ProvisioningServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvisioningServiceApplication.class, args);
	}

}
