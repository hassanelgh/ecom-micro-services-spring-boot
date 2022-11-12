package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder()
							.email("mohemed@gmail.com")
							.prenom("mohemed")
							.nom("el ghalbzouri")
							.build(),
					Customer.builder()
							.email("mahdi@gmail.com")
							.prenom("mahdi")
							.nom("achbab")
							.build(),
					Customer.builder()
							.email("aya@gmail.com")
							.prenom("aya")
							.nom("tadmouri")
							.build(),
					Customer.builder()
							.email("mahdia@gmail.com")
							.prenom("mahdia")
							.nom("el yousfi")
							.build()
					)

			);
		};
	}
}

