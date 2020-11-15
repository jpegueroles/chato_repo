package com.cl.adm_usuarios.entities;

public class Cliente extends Usuario{
	
	private int	rut;
	private String nombres;
	private String apellidos;
	private int telefono;
	private String afp;
	private String direccion;
	private String comuna;
	private int edad;
	enum Sist_salud {
	    FONASA,
	    ISAPRE
	  }
	
	public Cliente(){
		
	}
	
	public Cliente(int rut, String nombres, String apellidos, int telefono, String afp, String direccion, String comuna,
			int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + "]";
	}

	public int getRut() {
		return rut;
	}	
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
