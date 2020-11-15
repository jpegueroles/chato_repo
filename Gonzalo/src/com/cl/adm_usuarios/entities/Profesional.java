package com.cl.adm_usuarios.entities;

public class Profesional extends Usuario{

	 private String titulo;
	 private String fechangreso;
	 
	 public Profesional() {
		 
	 }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechangreso() {
		return fechangreso;
	}

	public void setFechangreso(String fechangreso) {
		this.fechangreso = fechangreso;
	}

	/**
	 * @param titulo
	 * @param fechangreso
	 */
	public Profesional(String titulo, String fechangreso) {
		super();
		this.titulo = titulo;
		this.fechangreso = fechangreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechangreso=" + fechangreso + "]";
	}
	 
	
	
}
