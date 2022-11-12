package com.example.orderservice.dto;

import com.example.orderservice.entities.Order;
import com.example.orderservice.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductItemDTO {
    private String id;
    private Product product;
    private double price;
    private int quantity;
    private double discount;

}
