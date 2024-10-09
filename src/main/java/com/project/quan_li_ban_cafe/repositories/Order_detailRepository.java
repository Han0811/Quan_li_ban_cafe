package com.project.quan_li_ban_cafe.repositories;

import com.project.quan_li_ban_cafe.models.Order_detail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Order_detailRepository extends JpaRepository<Order_detail, Long> {
    List<Order_detail> findByOrder_id(Long order_id);
}
