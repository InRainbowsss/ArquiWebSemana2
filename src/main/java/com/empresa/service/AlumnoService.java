package com.empresa.service;

import java.time.LocalDate;
import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {
	
	public abstract List<Alumno> listaPorPK(int idAlumno);
	
	public abstract List<Alumno> listaPorDNI(String dni);
	
	public abstract List<Alumno> listaPorFecha(LocalDate fechaInicio, LocalDate fechaFin);

}
