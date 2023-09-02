package com.arthur.demo.springmysqldocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.demo.springmysqldocker.repository.OrderItemRepository;

@Service
public class OrderService {

	@Autowired
	private OrderItemRepository repo;
	
	
}
