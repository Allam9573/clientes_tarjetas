package com.example.demo.controllers;

import java.text.ParseException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Clientes;
import com.example.demo.services.impl.ClientesImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	
	@Autowired
	private ClientesImpl clienteImplementacionService;
	
	@GetMapping("/crear")
	public Clientes crearCliente(@RequestBody Clientes cliente) throws ParseException {
		
		clienteImplementacionService.guardarCliente(cliente);			
		return cliente;
	}
	
	
	@GetMapping("/buscar/{id}")
	public Optional<Clientes> buscarCliente(@PathVariable(name="id") String id) {
		return clienteImplementacionService.buscarPorId(id);
	}
}
