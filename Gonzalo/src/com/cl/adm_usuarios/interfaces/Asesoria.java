package com.cl.adm_usuarios.interfaces;

public interface Asesoria {
	
	public void analizarUsuario();
	public void	addCliente(int rut, String nombres, String apellidos, int telefono, String afp, String direccion, String comuna, int edad,	int isapre);
	public void	addProfesional();
	public void	addAdministrativo();
	public void	eliminarUsuario();
}
