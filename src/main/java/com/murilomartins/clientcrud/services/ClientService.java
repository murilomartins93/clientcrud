package com.murilomartins.clientcrud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.murilomartins.clientcrud.dto.ClientDTO;
import com.murilomartins.clientcrud.entities.Client;
import com.murilomartins.clientcrud.repositories.ClientRepository;



@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public ClientDTO findByID(Long id) {
		Client client = repository.findById(id).orElseThrow(() -> new RuntimeException("Resource not found"));
		return new ClientDTO(client);
	}
	
}
