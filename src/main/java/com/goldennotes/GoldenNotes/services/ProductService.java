package com.goldennotes.GoldenNotes.services;

import com.goldennotes.GoldenNotes.entities.Product;
import com.goldennotes.GoldenNotes.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveSale(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllSales() {
        return productRepository.findAll();
    }
}
