package org.codigorupestre.kiosco.cobrarcomision.paises;

import org.codigorupestre.kiosco.cobrarcomision.CobroComision;

public class CobroComisionBolivia extends CobroComision {

	@Override
	protected void calculaIVA() {
		importeIVA = importeSinIVA * 0.13;
	}
	

}
