package com.example.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tarjetas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarjeta {

	@Id
	@Column(name="idunico")
	private int idTarjeta;
	
	@Column(name="numerotarjeta")
	private String numeroTarjeta;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechavencimiento")
	private Date fechaVencimiento;
	
	private int cvv;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="identidad", referencedColumnName="identidad")
	private Clientes cliente;
	
}
