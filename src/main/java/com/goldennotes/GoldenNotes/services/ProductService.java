package com.goldennotes.GoldenNotes.services;

import com.goldennotes.GoldenNotes.entities.Product;
import com.goldennotes.GoldenNotes.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
