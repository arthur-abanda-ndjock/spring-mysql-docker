package com.arthur.demo.springmysqldocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.demo.springmysqldocker.entities.Client;
import com.arthur.demo.springmysqldocker.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	


}
