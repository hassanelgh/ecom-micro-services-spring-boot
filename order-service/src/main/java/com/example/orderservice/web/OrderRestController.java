package com.example.orderservice.web;

import com.example.orderservice.dto.FullOrderDTO;
import com.example.orderservice.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

    private OrderService orderService;

    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/fullOrder/{id}")
    public FullOrderDTO getfullorder(@PathVariable(name = "id") String id){
        return orderService.getFullOrder(id);
    }
}
