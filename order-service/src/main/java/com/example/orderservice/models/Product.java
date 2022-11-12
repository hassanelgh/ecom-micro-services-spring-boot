package com.example.orderservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private double price;
    private int quantity;

}
