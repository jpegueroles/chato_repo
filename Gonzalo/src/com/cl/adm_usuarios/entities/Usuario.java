package com.cl.adm_usuarios.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario {
	
	private String nombre;
	private String fcha_nac;
	private int run;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String fcha_nac, int run) {
		super();
		this.nombre = nombre;
		this.fcha_nac = fcha_nac;
		this.run = run;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fcha_nac=" + fcha_nac + ", run=" + run + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFcha_nac() {
		return fcha_nac;
	}
	public void setFcha_nac(String fcha_nac) {
		this.fcha_nac = fcha_nac;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public void mostrarEdad() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fcha_nac = LocalDate.parse("15/08/1993", fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fcha_nac, ahora);
		System.out.printf("Tu edad es: %s años, %s meses y %s días",
		                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
		
	}
}
