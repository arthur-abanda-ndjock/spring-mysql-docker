package com.arthur.demo.springmysqldocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arthur.demo.springmysqldocker.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
