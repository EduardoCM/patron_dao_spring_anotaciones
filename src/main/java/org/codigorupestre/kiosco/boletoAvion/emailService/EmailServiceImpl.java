package org.codigorupestre.kiosco.boletoAvion.emailService;

import java.util.logging.Logger;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class EmailServiceImpl implements EmailService, InitializingBean, DisposableBean {
	
	private final Logger LOG = Logger.getLogger(EmailServiceImpl.class.getName());

	@Override
	public void enviarNotificacionPorCorreo() {
		LOG.info("Se envia email de notificacion");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Se cierran los recursos del sistema");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Se cargan las propiedades");
		
	
	}

	
	
	
	/*
	 * init-method="inicio"
	public void inicio() {
		System.out.println("Se cargan propiedades para enviar correos electronicos");
	}
	
	destroy-method="termina"
	public void termina() {
		System.out.println("Se cierrarn recursos de envio de correos");
	}
	*/


	
	

}
