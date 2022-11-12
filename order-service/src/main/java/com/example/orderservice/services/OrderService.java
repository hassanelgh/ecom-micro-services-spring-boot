package com.example.orderservice.services;

import com.example.orderservice.dto.FullOrderDTO;

public interface OrderService {
    public FullOrderDTO getFullOrder(String id);
}
