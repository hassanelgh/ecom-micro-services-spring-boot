package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {

			productRepository.saveAll(List.of(
					Product.builder().price(100000).quantity(10).name("predator").build(),
					Product.builder().price(4000).quantity(20).name("appel").build(),
					Product.builder().price(50.99).quantity(10000).name("short").build(),
					Product.builder().price(9000).quantity(1258).name("acer").build(),
					Product.builder().price(1000).quantity(1000).name("Samsung").build()

			));
		};
	}
}
