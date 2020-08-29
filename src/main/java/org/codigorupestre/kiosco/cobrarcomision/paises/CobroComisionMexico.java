package org.codigorupestre.kiosco.cobrarcomision.paises;

import org.codigorupestre.kiosco.cobrarcomision.CobroComision;

public class CobroComisionMexico extends CobroComision {

	@Override
	protected void calculaIVA() {
		importeIVA = importeSinIVA * 0.16;
	}
	
	

}
