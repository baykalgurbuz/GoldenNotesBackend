package com.goldennotes.GoldenNotes.controllers;

import com.goldennotes.GoldenNotes.entities.Product;
import com.goldennotes.GoldenNotes.entities.Sale;
import com.goldennotes.GoldenNotes.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins ="http://localhost:3000")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }
}
