package com.example.orderservice;

import com.example.orderservice.entities.Order;
import com.example.orderservice.entities.ProductItem;
import com.example.orderservice.enums.OrderType;
import com.example.orderservice.models.Customer;
import com.example.orderservice.models.Product;
import com.example.orderservice.openfeign.CustomerRestClientService;
import com.example.orderservice.openfeign.InventoryRestClientService;
import com.example.orderservice.repositories.OrderRepository;
import com.example.orderservice.repositories.ProductItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
@EnableFeignClients
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(CustomerRestClientService customerRestClientService,
										InventoryRestClientService inventoryRestClientService,
										ProductItemRepository productItemRepository,
										OrderRepository orderRepository){
		return args -> {


			List<Customer> allCustomer=customerRestClientService.allCustomer().getContent().stream().toList();
			List<Product> allProduct=inventoryRestClientService.allProducts().getContent().stream().toList();
			Random random=new Random();
			for (int i = 0; i < 20; i++) {
				Customer customer= allCustomer.get(random.nextInt(0,allCustomer.size()));
				Order order=Order.builder()
						.id(UUID.randomUUID().toString())
						.orderType(Math.random()<0.5 ? OrderType.CREATED : OrderType.PENDING)
						.customerId(customer.getId())
						.dateCreated(new Date())
						.build();

				Order ordersave=orderRepository.save(order);


				for (int j = 0; j < allProduct.size(); j++) {
					if(Math.random()>0.7) continue;
					ProductItem productItem=ProductItem.builder()
							.id(UUID.randomUUID().toString())
							.productId(allProduct.get(j).getId())
							.order(ordersave)
							.price(allProduct.get(j).getPrice())
							.quantity(1+random.nextInt(10))
							.discount(Math.random())
							.build();

					productItemRepository.save(productItem);

				}
			}



		};
	}
}
