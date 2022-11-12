package com.example.orderservice.mappers;

import com.example.orderservice.dto.FullOrderDTO;
import com.example.orderservice.dto.ProductItemDTO;
import com.example.orderservice.entities.Order;
import com.example.orderservice.entities.ProductItem;
import com.example.orderservice.models.Customer;
import com.example.orderservice.models.Product;

public interface OrderMapper {

    ProductItemDTO fromProductItem(ProductItem productItem);

    FullOrderDTO fromOrder(Order order);
}
