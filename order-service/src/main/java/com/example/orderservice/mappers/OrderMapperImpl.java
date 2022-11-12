package com.example.orderservice.mappers;

import com.example.orderservice.dto.FullOrderDTO;
import com.example.orderservice.dto.ProductItemDTO;
import com.example.orderservice.entities.Order;
import com.example.orderservice.entities.ProductItem;
import com.example.orderservice.exceptions.CustomerNotFoundException;
import com.example.orderservice.exceptions.ProductNotFoundException;
import com.example.orderservice.models.Customer;
import com.example.orderservice.models.Product;
import com.example.orderservice.openfeign.CustomerRestClientService;
import com.example.orderservice.openfeign.InventoryRestClientService;

import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class OrderMapperImpl implements OrderMapper {

    private CustomerRestClientService customerRestClientService;
    private InventoryRestClientService inventoryRestClientService;

    public OrderMapperImpl(CustomerRestClientService customerRestClientService, InventoryRestClientService inventoryRestClientService) {

        this.customerRestClientService = customerRestClientService;
        this.inventoryRestClientService = inventoryRestClientService;
    }

    @Override
    public ProductItemDTO fromProductItem(ProductItem productItem) {
        ProductItemDTO productItemDTO=new ProductItemDTO();
        Product product=inventoryRestClientService.productById(productItem.getProductId());
        if(product==null)  throw new ProductNotFoundException("product not found in inventory");
        productItemDTO.setDiscount(productItem.getDiscount());
        productItemDTO.setId(productItem.getId());
        productItemDTO.setPrice(productItem.getPrice());
        productItemDTO.setQuantity(productItem.getQuantity());
        productItemDTO.setProduct(product);
        return productItemDTO;
    }

    @Override
    public FullOrderDTO fromOrder(Order order) {
        FullOrderDTO fullOrderDTO=new FullOrderDTO();
        Customer customer=customerRestClientService.customerById(order.getCustomerId());
        if (customer == null) throw new CustomerNotFoundException("Customer not found for order " + order.getId());
        fullOrderDTO.setOrderType(order.getOrderType());
        fullOrderDTO.setId(order.getId());
        fullOrderDTO.setDateCreated(order.getDateCreated());
        fullOrderDTO.setProductItemDTOS(order.getProductItems().stream().map(productItem -> fromProductItem(productItem)).collect(Collectors.toList()));
        fullOrderDTO.setCustomer(customer);

        return fullOrderDTO;
    }
}
