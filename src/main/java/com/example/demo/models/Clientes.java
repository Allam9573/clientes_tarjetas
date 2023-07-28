package com.example.demo.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
public class Clientes {
	
	@Id
	@Column(name="identidad")
	private String id;
	
	private String nombre;
	
	private String apellido;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechanacimiento")
	private Date fechaNacimiento;
	
	private String genero;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="iddireccion", referencedColumnName="iddireccion")
	private Direccion direccion;
	
	@OneToMany(mappedBy="cliente")
	private List<Tarjeta> tarjetas;
}

