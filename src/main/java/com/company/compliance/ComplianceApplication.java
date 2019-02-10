package com.company.compliance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class ComplianceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComplianceApplication.class, args);
	}

}

