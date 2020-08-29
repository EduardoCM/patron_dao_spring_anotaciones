package org.codigorupestre.kiosco.main;

import org.codigorupestre.kiosco.boletoAvion.mondel.BoletoAvion;
import org.codigorupestre.kiosco.boletoAvion.service.ComprarBoletoService;
import org.codigorupestre.kiosco.boletoAvion.service.ComprarBoletoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotacionesService {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-autowired.xml");		
		ComprarBoletoService service = appContext.getBean("boletoService", ComprarBoletoServiceImpl.class);
		BoletoAvion boletoAvion = appContext.getBean("boletoEduardo", BoletoAvion.class);
		
		service.comprarBoleto(boletoAvion);
		
		((ClassPathXmlApplicationContext)appContext).close();
	}

}
