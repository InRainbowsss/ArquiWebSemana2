package com.empresa.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "modalidad")
public class Modalidad {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int idModalidad;
	private String nombre;
	private int numhombres;
	private int nummujeres;
	private int edadmaxima; 
	private String sede;
	private boolean estado;
	private LocalDate fecharegistro;
	private LocalDate fechaactualizacion;
	
	@ManyToOne
    @JoinColumn(name = "iddeporte")
    private Deporte deporte;
	

}
