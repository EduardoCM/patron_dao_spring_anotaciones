package org.codigorupestre.kiosco.main;

import org.codigorupestre.kiosco.boletoAvion.emailService.EmailService;
import org.codigorupestre.kiosco.boletoAvion.emailService.EmailServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailService {
	
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-vuelos.xml");
		
		EmailService email = appContext.getBean("emailDos", EmailServiceImpl.class);
		email.enviarNotificacionPorCorreo();
		
		((ClassPathXmlApplicationContext)appContext).close();
		
	}

}
