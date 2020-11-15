package com.cl.adm_usuarios.entities;

import com.cl.adm_usuarios.interfaces.Asesoria;

public class Administrativo extends Usuario implements Asesoria{
	private String area;
	private String expPrevia;
	
	public Administrativo() {
		
	}

	/**
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpPrevia() {
		return expPrevia;
	}

	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Area: "+ this.getArea());
		System.out.println("Experiencia: "+ this.getExpPrevia());
	}
}
