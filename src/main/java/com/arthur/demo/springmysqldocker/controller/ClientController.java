package com.arthur.demo.springmysqldocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.demo.springmysqldocker.entities.Client;
import com.arthur.demo.springmysqldocker.service.ClientService;

@RestController
public class ClientController {
	 
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
	@PostMapping("/clients/batch")
    public ResponseEntity<String> createClient(@RequestBody List<Client> clients) {
        clientService.saveClients(clients);
        return new ResponseEntity<>("Successful", HttpStatus.CREATED);
    }
}
