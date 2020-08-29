package org.codigorupestre.kiosco.main;

import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.codigorupestre.kiosco.boletoAvion.dao.BoletosDAO;
import org.codigorupestre.kiosco.boletoAvion.dao.BoletosDAOImpl;
import org.codigorupestre.kiosco.boletoAvion.mondel.BoletoAvion;
import org.codigorupestre.kiosco.cobrarcomision.CobroComision;
import org.codigorupestre.kiosco.cobrarcomision.paises.CobroComisionBolivia;
import org.codigorupestre.kiosco.cobrarcomision.paises.CobroComisionColombia;
import org.codigorupestre.kiosco.cobrarcomision.paises.CobroComisionMexico;
import org.codigorupestre.kiosco.cobrarcomision.paises.CobroComisionPeru;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiciosMain {
	
	private static final Logger LOG = Logger.getLogger(ServiciosMain.class.getName());
	
	public static void main(String[] args) {
		
		ImageIcon iconLatinoAmerica = new ImageIcon("src/main/resources/imagenes/latinoamerica.png");
		ImageIcon bolivia = new ImageIcon("src/main/resources/imagenes/Bolivia.png");
		ImageIcon colombia = new ImageIcon("src/main/resources/imagenes/Colombia.png");
		ImageIcon mexico = new ImageIcon("src/main/resources/imagenes/Mexico.png");
		ImageIcon peru = new ImageIcon("src/main/resources/imagenes/Peru.jpeg");
		
		String[] options = { "Colombia", "Bolivia", "Peru", "Mexico" };		
		String pais = (String) JOptionPane.showInputDialog(null, "Seleccione su pais donde vas a comprar tu boleto de avion",
				"Servicios", JOptionPane.QUESTION_MESSAGE, iconLatinoAmerica, options, null);

		CobroComision cobroComision = null;
		BoletosDAO boletosDAO = null;
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans-vuelos.xml");

		switch(pais) {
		
		case "Colombia":
			LOG.info("Servicio en colombia");
			double montoColombia = Double.parseDouble(JOptionPane.showInputDialog(null, "Pagar Boleto",
					"Servicio", JOptionPane.QUESTION_MESSAGE, colombia, null, null).toString());
			
			boletosDAO = appContext.getBean("boletodao", BoletosDAOImpl.class);
			boletosDAO.comprarBoleto(appContext.getBean("boletoEduardo",BoletoAvion.class));
			
			cobroComision = new CobroComisionColombia();
			cobroComision.setImporteSinIVA(montoColombia);
			cobroComision.calculaPrecioConIVA();
			cobroComision.imprimirTicket();
		
			break;
			
		case "Bolivia":
			LOG.info("Servicio en Bolivia");
			double montoBolivia = Double.parseDouble(JOptionPane.showInputDialog(null, "Monto a depositar",
					"Servicio", JOptionPane.QUESTION_MESSAGE, bolivia, null, null).toString());
			
			cobroComision = new CobroComisionBolivia();
			cobroComision.setImporteSinIVA(montoBolivia);
			cobroComision.calculaPrecioConIVA();
			cobroComision.imprimirTicket();
			break;
			
		case "Peru":
			LOG.info("Servicio en Peru");
			double montoPeru = Double.parseDouble(JOptionPane.showInputDialog(null, "Monto a depositar",
					"Servicio", JOptionPane.QUESTION_MESSAGE, peru, null, null).toString());
			
			cobroComision = new CobroComisionPeru();
			cobroComision.setImporteSinIVA(montoPeru);
			cobroComision.calculaPrecioConIVA();
			cobroComision.imprimirTicket();
			break;
			
		case "Mexico":
			LOG.info("Servicio en Mexico");
			double montoMexico = Double.parseDouble(JOptionPane.showInputDialog(null, "Monto a depositar",
					"Servicio", JOptionPane.QUESTION_MESSAGE, mexico, null, null).toString());
			
			
			
			
			
			cobroComision = new CobroComisionMexico();
			cobroComision.setImporteSinIVA(montoMexico);
			cobroComision.calculaPrecioConIVA();
			cobroComision.imprimirTicket();
			
			break;
		}
		
		
		
	}
	

}
