package com.example.products_with_JPA.service;

import com.example.products_with_JPA.model.Product;

import java.util.List;

public interface IProdutoService {

    List<Product> searchAll();
    Product search(Integer id);
    void save(Product product);
    void delete(Integer id);
}
