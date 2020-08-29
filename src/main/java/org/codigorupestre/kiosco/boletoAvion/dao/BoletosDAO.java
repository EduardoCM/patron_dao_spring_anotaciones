package org.codigorupestre.kiosco.boletoAvion.dao;

import java.util.List;

import org.codigorupestre.kiosco.boletoAvion.mondel.BoletoAvion;

public interface BoletosDAO {
	
	public void comprarBoleto(BoletoAvion boleto);
	
	public void cancelarBoleto(String codigo);
	
	public BoletoAvion buscarBoletoPorCodigo(String codigo);
	
	public List<BoletoAvion> obtenerBoletosPorVuelo(String vuelo);
	

}
