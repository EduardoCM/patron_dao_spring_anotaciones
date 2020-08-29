package org.codigorupestre.kiosco.boletoAvion.dao;

import java.util.List;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.codigorupestre.kiosco.boletoAvion.mondel.BoletoAvion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public class BoletosDAOImpl implements BoletosDAO {
	
	private Logger LOG = Logger.getLogger(BoletosDAOImpl.class.getName());
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	

	@Override
	public void comprarBoleto(BoletoAvion boleto) {
		LOG.info("Se realiza compra de boleto " + boleto);
		String QUERY_INSERT = "INSERT INTO boletoAvion (codigo, vuelo, nombre, origen, destino, asiento) VALUES (?, ?, ?, ?, ?, ?)"  ;	
		jdbcTemplate.update(QUERY_INSERT, new Object[] {boleto.getCodigo(), boleto.getVuelo(), boleto.getNombre(), boleto.getOrigen(), boleto.getDestino(), boleto.getAsiento()});
	}

	@Override
	public void cancelarBoleto(String codigo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoletoAvion buscarBoletoPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoletoAvion> obtenerBoletosPorVuelo(String vuelo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
