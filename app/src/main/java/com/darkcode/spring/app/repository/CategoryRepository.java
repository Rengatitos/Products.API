package com.darkcode.spring.app.repository;

import com.darkcode.spring.app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
