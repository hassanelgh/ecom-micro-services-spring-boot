package com.example.orderservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Customer {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}
