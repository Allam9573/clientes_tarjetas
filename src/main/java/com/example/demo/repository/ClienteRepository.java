package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Clientes;

public interface ClienteRepository extends CrudRepository<Clientes, String>{

	
	
}
