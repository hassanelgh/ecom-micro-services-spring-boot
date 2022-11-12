package com.example.orderservice.entities;

import com.example.orderservice.enums.OrderType;
import com.example.orderservice.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Order {

    @Id
    private String id;

    @Temporal(TemporalType.DATE)
    private Date dateCreated;

    @Enumerated(EnumType.STRING)
    private OrderType orderType;

    private Long customerId;

    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;

}
