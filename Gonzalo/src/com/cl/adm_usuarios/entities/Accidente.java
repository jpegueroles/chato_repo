package com.cl.adm_usuarios.entities;

public class Accidente {
	private int idenAccidente;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	public Accidente() {
		
	}

	/**
	 * @param idenAccidente
	 * @param rutCliente
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param origen
	 * @param consecuencias
	 */
	public Accidente(int idenAccidente, int rutCliente, String dia, String hora, String lugar, String origen,
			String consecuencias) {
		super();
		this.idenAccidente = idenAccidente;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.consecuencias = consecuencias;
	}

	public int getIdenAccidente() {
		return idenAccidente;
	}

	public void setIdenAccidente(int idenAccidente) {
		this.idenAccidente = idenAccidente;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
	public String toString() {
		return "Accidente [idenAccidente=" + idenAccidente + ", rutCliente=" + rutCliente + ", dia=" + dia + ", hora="
				+ hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias + "]";
	}
	
	
}
