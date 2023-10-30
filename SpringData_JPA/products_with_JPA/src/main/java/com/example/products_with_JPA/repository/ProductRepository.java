package com.example.products_with_JPA.repository;

import com.example.products_with_JPA.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {



}
