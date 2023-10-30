package com.example.products_with_JPA.controller;

import com.example.products_with_JPA.model.Product;
import com.example.products_with_JPA.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final IProdutoService produtoService;

    @Autowired
    public ProductController(IProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        produtoService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<?>> searchAllProducts(){
        return ResponseEntity.ok(produtoService.searchAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchById(@PathVariable Integer id){
       return ResponseEntity.ok(produtoService.search(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id){
        produtoService.delete(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
