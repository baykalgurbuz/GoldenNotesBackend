package com.goldennotes.GoldenNotes.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private Boolean status;

    @PrePersist
    protected void onCreate() {
        this.status = true;
    }
}
