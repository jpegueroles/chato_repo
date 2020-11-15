package com.cl.adm_usuarios.entities;

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
	
}
