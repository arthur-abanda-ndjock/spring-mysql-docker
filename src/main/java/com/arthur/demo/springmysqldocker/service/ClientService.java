package com.arthur.demo.springmysqldocker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.demo.springmysqldocker.entities.Client;
import com.arthur.demo.springmysqldocker.repository.ClientRepository;

//ClientService.java
@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	public void saveClients(List<Client> clients) {
		clientRepository.saveAll(clients);
	}

	public Client createClient(Client newClient) {
		return clientRepository.save(newClient);
	}
}
