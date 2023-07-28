package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tarjetas")
public class TarjetaController {
	
	@GetMapping("/crear")
	public String crearTarjeta() {
		return "Tarjeta";
	}
	@GetMapping("/eliminar")
	public String eliminarTarjeta() {
		return "Tarjeta";
	}
	
	//asociar tarjeta a los clientes

}
