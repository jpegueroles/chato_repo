package com.cl.adm_usuarios.implement;

import java.util.ArrayList;

import com.cl.adm_usuarios.entities.Capacitacion;
import com.cl.adm_usuarios.entities.Cliente;
import com.cl.adm_usuarios.entities.Cliente.Sist_salud;
import com.cl.adm_usuarios.entities.Usuario;
import com.cl.adm_usuarios.interfaces.Asesoria;

public class Contenedor implements Asesoria{
	private ArrayList<Asesoria> asesorias = new ArrayList<Asesoria>();
	private ArrayList<Capacitacion> capacitaniones = new ArrayList<Capacitacion>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	public void addCliente(int rut, String nombres, String apellidos, int telefono, String afp, String direccion, String comuna, int edad,	int isapre) {
		Cliente cliente = new Cliente();
		
		switch (isapre) {
			case 1: {
				Sist_salud siSalud = null;
				cliente.setSiSalud(siSalud.FONASA);
			}
			case 2: {
				Sist_salud siSalud = null;
				cliente.setSiSalud(siSalud.ISAPRE);
			}
		}
		
	}
	
	public void addProfesional() {
		
	}
	
	public void addAdministrativo() {
		
	}
	
	public void almacenarCapacitacion() {
		
	}
	
	public void eliminarUsuario() {
		
	}
	
	public void listarUsuarios() {
		
	}
	
	public void listarUsuariosXTipo() {
		
	}
	
	public void listarCapacitaciones() {
		
	}

	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		
	}
	
	
}
