package com.cl.adm_usuarios.entities;

public class Revision {
	private int idenRevision;
	private int idenViterreno;
	private String nomAluRevision;
	private String detalle;
	private int estado;
	
	public Revision() {
		
	}

	/**
	 * @param idenRevision
	 * @param idenViterreno
	 * @param nomAluRevision
	 * @param detalle
	 * @param estado
	 */
	public Revision(int idenRevision, int idenViterreno, String nomAluRevision, String detalle, int estado) {
		super();
		this.idenRevision = idenRevision;
		this.idenViterreno = idenViterreno;
		this.nomAluRevision = nomAluRevision;
		this.detalle = detalle;
		this.estado = estado;
	}

	public int getIdenRevision() {
		return idenRevision;
	}

	public void setIdenRevision(int idenRevision) {
		this.idenRevision = idenRevision;
	}

	public int getIdenViterreno() {
		return idenViterreno;
	}

	public void setIdenViterreno(int idenViterreno) {
		this.idenViterreno = idenViterreno;
	}

	public String getNomAluRevision() {
		return nomAluRevision;
	}

	public void setNomAluRevision(String nomAluRevision) {
		this.nomAluRevision = nomAluRevision;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idenRevision=" + idenRevision + ", idenViterreno=" + idenViterreno + ", nomAluRevision="
				+ nomAluRevision + ", detalle=" + detalle + ", estado=" + estado + "]";
	}
	
	
	
}
