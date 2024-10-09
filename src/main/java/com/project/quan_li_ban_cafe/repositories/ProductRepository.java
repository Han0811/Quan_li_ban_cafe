package com.project.quan_li_ban_cafe.repositories;

import com.project.quan_li_ban_cafe.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}
