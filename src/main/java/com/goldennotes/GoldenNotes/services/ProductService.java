package com.goldennotes.GoldenNotes.services;

import com.goldennotes.GoldenNotes.entities.Product;
import com.goldennotes.GoldenNotes.entities.Sale;
import com.goldennotes.GoldenNotes.repositories.ProductRepository;
import com.goldennotes.GoldenNotes.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
}
