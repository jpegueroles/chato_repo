package com.cl.adm_usuarios.entities;

import com.cl.adm_usuarios.interfaces.Asesoria;

public class Profesional extends Usuario implements Asesoria{

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

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Titulo: "+ this.getTitulo());
		System.out.println("Fecha Ingreso: "+ this.getFechangreso());
	}
	 

}
