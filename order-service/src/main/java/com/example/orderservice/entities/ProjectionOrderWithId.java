package com.example.orderservice.entities;

import com.example.orderservice.entities.Order;
import com.example.orderservice.entities.ProductItem;
import com.example.orderservice.enums.OrderType;
import org.springframework.data.rest.core.config.Projection;


import java.util.Date;
import java.util.List;

@Projection(name = "orderWithId", types = Order.class)
public interface ProjectionOrderWithId {

    public String getId();

    public Date getDateCreated();

    public OrderType getOrderType();

    public Long getCustomerId();

}
