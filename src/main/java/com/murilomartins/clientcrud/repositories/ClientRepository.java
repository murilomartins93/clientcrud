package com.murilomartins.clientcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murilomartins.clientcrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
