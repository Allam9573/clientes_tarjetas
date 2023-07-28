package com.example.demo.services;

import java.util.Optional;

import com.example.demo.models.Clientes;

public interface ClientesService {

	public Clientes guardarCliente(Clientes cliente);
	
	public Clientes eliminarCliente(Clientes cliente);
	
	public Optional<Clientes> buscarPorId(String identidad);
}
