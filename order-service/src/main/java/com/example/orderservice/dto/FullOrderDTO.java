package com.example.orderservice.dto;

import com.example.orderservice.entities.ProductItem;
import com.example.orderservice.enums.OrderType;
import com.example.orderservice.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Builder
public class FullOrderDTO {
    private String id;

    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @Enumerated(EnumType.STRING)
    private OrderType orderType;


    private Customer customer;

    private List<ProductItemDTO> productItemDTOS;
}
