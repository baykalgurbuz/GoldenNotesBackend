package com.goldennotes.GoldenNotes.controllers;

import com.goldennotes.GoldenNotes.entities.Sale;
import com.goldennotes.GoldenNotes.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins ="http://localhost:3000")
public class SaleController {
    @Autowired
    private SaleService saleService;
    @PostMapping
    public Sale createSale(@RequestBody Sale sale)
    {
       return saleService.saveSale(sale);
    }
    @GetMapping
    public List<Sale> getAllSales()
    {
        return saleService.getAllSales();
    }
}
