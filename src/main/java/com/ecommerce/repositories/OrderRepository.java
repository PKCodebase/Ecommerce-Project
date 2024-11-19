package com.ecommerce.repositories;

import com.ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository    extends JpaRepository<Order,Long> {
    List<Order> findByUserId(Long userId);
}