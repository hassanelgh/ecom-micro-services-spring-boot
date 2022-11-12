package com.example.orderservice.services;

import com.example.orderservice.dto.FullOrderDTO;
import com.example.orderservice.entities.Order;
import com.example.orderservice.exceptions.OrderNotFoundException;
import com.example.orderservice.mappers.OrderMapper;
import com.example.orderservice.openfeign.CustomerRestClientService;
import com.example.orderservice.openfeign.InventoryRestClientService;
import com.example.orderservice.repositories.OrderRepository;
import com.example.orderservice.repositories.ProductItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    public OrderServiceImpl(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    public FullOrderDTO getFullOrder(String id) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException("order not found for id " + id));
        return orderMapper.fromOrder(order);
    }
}
