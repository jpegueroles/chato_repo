package com.cl.adm_usuarios.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import com.cl.adm_usuarios.interfaces.Asesoria;

public class Usuario implements Asesoria{
	
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
		LocalDate fcha_nac = LocalDate.parse(this.getFcha_nac(), fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fcha_nac, ahora);
		System.out.printf("Tu edad es: %s anios, %s meses y %s dias",
		                    periodo.getYears(), periodo.getMonths(), periodo.getDays());	
	}
	
	public void analizarUsuario(){
		System.out.printf("Nombre: ", this.getNombre());
		System.out.printf("RUN: ", this.getRun());
	}

	@Override
	public void addCliente() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addProfesional() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAdministrativo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario() {
		// TODO Auto-generated method stub
		
	}
	
}
