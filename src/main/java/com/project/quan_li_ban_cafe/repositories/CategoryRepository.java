package com.project.quan_li_ban_cafe.repositories;

import com.project.quan_li_ban_cafe.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
