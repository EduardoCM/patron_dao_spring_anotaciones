package org.codigorupestre.kiosco.main;

import org.codigorupestre.kiosco.boletoAvion.mondel.BoletoAvion;
import org.codigorupestre.kiosco.boletoAvion.service.ComprarBoletoService;
import org.codigorupestre.kiosco.boletoAvion.service.ComprarBoletoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentScan {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-component-scan.xml");
		ComprarBoletoService service = appContext.getBean(ComprarBoletoServiceImpl.class);
		
		BoletoAvion boletoAvion = new BoletoAvion();
		boletoAvion.setNombre("Eduardo Castillo");
		boletoAvion.setOrigen("Mexico");
		boletoAvion.setDestino("Colombia");
		boletoAvion.setAsiento("A23");
		boletoAvion.setCodigo("AA33");
		boletoAvion.setVuelo("VUL45673");

		service.comprarBoleto(boletoAvion);

		((ClassPathXmlApplicationContext) appContext).close();
	}

}
