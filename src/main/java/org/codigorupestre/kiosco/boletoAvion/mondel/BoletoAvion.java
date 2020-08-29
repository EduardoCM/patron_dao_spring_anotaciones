package org.codigorupestre.kiosco.boletoAvion.mondel;

public class BoletoAvion {

	private int id_boleto;

	private String codigo;

	private String vuelo;

	private String nombre;

	private String origen;

	private String destino;

	private String asiento;

	public int getId_boleto() {
		return id_boleto;
	}

	public void setId_boleto(int id_boleto) {
		this.id_boleto = id_boleto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getVuelo() {
		return vuelo;
	}

	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	@Override
	public String toString() {
		return "BoletoAvion [id_boleto=" + id_boleto + ", codigo=" + codigo + ", vuelo=" + vuelo + ", nombre=" + nombre
				+ ", origen=" + origen + ", destino=" + destino + ", asiento=" + asiento + "]";
	}

}
