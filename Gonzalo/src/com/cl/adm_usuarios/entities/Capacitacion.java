package com.cl.adm_usuarios.entities;

	public class Capacitacion{
		private int indentificador;
		private int rut_cliente;
		private String hora;
		private String lugar;
		private String durecion;
		private int cant_asist;
		enum dia{
			LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
		}
		
		public Capacitacion() {
			
		}
		
		public Capacitacion(int indentificador, int rut_cliente, String hora, String lugar, String durecion,
				int cant_asist) {
			super();
			this.indentificador = indentificador;
			this.rut_cliente = rut_cliente;
			this.hora = hora;
			this.lugar = lugar;
			this.durecion = durecion;
			this.cant_asist = cant_asist;
		}
		@Override
		public String toString() {
			return "Capacitacion [indentificador=" + indentificador + ", rut_cliente=" + rut_cliente + ", hora=" + hora
					+ ", lugar=" + lugar + ", durecion=" + durecion + ", cant_asist=" + cant_asist + "]";
		}
		public int getIndentificador() {
			return indentificador;
		}
		public void setIndentificador(int indentificador) {
			this.indentificador = indentificador;
		}
		public int getRut_cliente() {
			return rut_cliente;
		}
		public void setRut_cliente(int rut_cliente) {
			this.rut_cliente = rut_cliente;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public String getLugar() {
			return lugar;
		}
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}
		public String getDurecion() {
			return durecion;
		}
		public void setDurecion(String durecion) {
			this.durecion = durecion;
		}
		public int getCant_asist() {
			return cant_asist;
		}
		public void setCant_asist(int cant_asist) {
			this.cant_asist = cant_asist;
		}
		
		
	}
