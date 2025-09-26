package com.darkcode.spring.app.repository;

import com.darkcode.spring.app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {}
