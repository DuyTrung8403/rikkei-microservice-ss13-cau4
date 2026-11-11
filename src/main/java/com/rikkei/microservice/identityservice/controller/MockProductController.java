package com.rikkei.microservice.identityservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class MockProductController {

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> getProducts() {
        List<Map<String, Object>> products = List.of(
                Map.of("id", 1, "name", "Laptop Dell XPS 15", "price", 1500),
                Map.of("id", 2, "name", "iPhone 15 Pro Max", "price", 1200),
                Map.of("id", 3, "name", "Sony WH-1000XM5 Headphone", "price", 350)
        );
        return ResponseEntity.ok(products);
    }
}
