package org.codigorupestre.kiosco.boletoAvion.service;

import org.codigorupestre.kiosco.boletoAvion.dao.BoletosDAO;
import org.codigorupestre.kiosco.boletoAvion.emailService.EmailService;
import org.codigorupestre.kiosco.boletoAvion.mondel.BoletoAvion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class ComprarBoletoServiceImpl implements ComprarBoletoService {
	
	@Autowired
	private BoletosDAO boletosDao;
	
	private EmailService emailService;

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}




	@Override
	public void comprarBoleto(BoletoAvion boletoAvion) {
		
		boletosDao.comprarBoleto(boletoAvion);
		
		emailService.enviarNotificacionPorCorreo();
		
	}

}
