package com.cl.adm_usuarios.entities;

public class VisitaTerreno {
	private int idenViterreno;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	public VisitaTerreno() {
		
	}

	/**
	 * @param idenViterreno
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param comentarios
	 */
	public VisitaTerreno(int idenViterreno, int rutCliente, String dia, String hora, String lugar, String comentarios) {
		super();
		this.idenViterreno = idenViterreno;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
	}

	public int getIdenViterreno() {
		return idenViterreno;
	}

	public void setIdenViterreno(int idenViterreno) {
		this.idenViterreno = idenViterreno;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "VisitaTerreno [idenViterreno=" + idenViterreno + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}
	
	
}
