package com.darkcode.spring.app.controller;

import com.darkcode.spring.app.model.Product;
import com.darkcode.spring.app.model.Category;
import com.darkcode.spring.app.repository.ProductRepository;
import com.darkcode.spring.app.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired private ProductRepository productRepository;
    @Autowired private CategoryRepository categoryRepository;

    @GetMapping
    public List<Product> all() {
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product no encontrado"));
    }

    // Para crear recibimos un JSON con categoryId y datos del producto
    public static class ProductRequest {
        public Long categoryId;
        public String name;
        public Double price;
        public Integer stock;
    }

    @PostMapping
    public Product create(@RequestBody ProductRequest req) {
        Product p = new Product();
        p.setName(req.name);
        p.setPrice(req.price);
        p.setStock(req.stock != null ? req.stock : 0);
        if (req.categoryId != null) {
            Category cat = categoryRepository.findById(req.categoryId).orElse(null);
            p.setCategory(cat);
        }
        return productRepository.save(p);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody ProductRequest req) {
        Product p = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product no encontrado"));
        p.setName(req.name != null ? req.name : p.getName());
        p.setPrice(req.price != null ? req.price : p.getPrice());
        p.setStock(req.stock != null ? req.stock : p.getStock());
        if (req.categoryId != null) {
            Category cat = categoryRepository.findById(req.categoryId).orElse(null);
            p.setCategory(cat);
        }
        return productRepository.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        productRepository.deleteById(id);
    }
}
