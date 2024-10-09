package com.project.quan_li_ban_cafe.repositories;

import com.project.quan_li_ban_cafe.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
