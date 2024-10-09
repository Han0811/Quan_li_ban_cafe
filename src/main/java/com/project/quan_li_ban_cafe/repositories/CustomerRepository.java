package com.project.quan_li_ban_cafe.repositories;

import com.project.quan_li_ban_cafe.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
