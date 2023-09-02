package com.arthur.demo.springmysqldocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthur.demo.springmysqldocker.entities.Client;

//ClientRepository.java
public interface ClientRepository extends JpaRepository<Client, Long> {

}