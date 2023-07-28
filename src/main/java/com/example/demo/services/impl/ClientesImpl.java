package com.example.demo.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Clientes;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.services.ClientesService;


@Service
public class ClientesImpl implements ClientesService{
	
	@Autowired
	private ClienteRepository clienteRepositorio;

	@Override
	public Clientes guardarCliente(Clientes cliente) {
		clienteRepositorio.save(cliente);
		return null;
	}

	@Override
	public Clientes eliminarCliente(Clientes cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Clientes> buscarPorId(String identidad) {
		Optional<Clientes> cliente = clienteRepositorio.findById(identidad);
		return cliente;
	}

}
