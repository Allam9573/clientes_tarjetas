package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="direcciones")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddireccion;

	private String departamento;
	
	private String ciudad;
	
	private String calle;
	
	@JsonIgnore	
	@OneToOne(mappedBy = "direccion")
	private Clientes cliente;
	
}
