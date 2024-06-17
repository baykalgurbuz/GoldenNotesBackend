package com.goldennotes.GoldenNotes.repositories;

import com.goldennotes.GoldenNotes.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
