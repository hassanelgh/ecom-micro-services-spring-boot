package com.example.orderservice.entities;

import com.example.orderservice.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class ProductItem {
    @Id
    private String id;
    private Long productId;
    private double price;
    private int quantity;
    private double discount;
    @ManyToOne
    private Order order;

}
