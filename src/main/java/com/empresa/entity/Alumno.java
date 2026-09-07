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

@Getter
@Setter
@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer idAlumno;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String dni;
    private String correo;
    private LocalDate fechanacimiento;
    private LocalDate fecharegistro;
    private LocalDate fechaactualizacion;
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "idpais")
    private Pais pais;
    
    @ManyToOne
    @JoinColumn(name = "idmodalidad")
    private Modalidad modalidad;
    
    

}