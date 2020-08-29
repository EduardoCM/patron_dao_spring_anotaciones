package org.codigorupestre.kiosco.cobrarcomision;

public abstract class CobroComision {
	
	protected double importeSinIVA;
	protected double importeIVA;
	protected double importeTotal;
	
	protected abstract void calculaIVA();
	
	public void calculaPrecioConIVA() {
		this.calculaIVA();
		importeTotal = importeSinIVA + importeIVA;
	}
	
	
	public void imprimirTicket() {
		System.out.println("Servicio realizado EXITOSAMENTE");
		System.out.println("Importe sin IVA: " + importeSinIVA);
		System.out.println("IVA: " + importeIVA);
		System.out.println("TOTAL A PAGAR: " + importeTotal);
	}

	

	public void setImporteSinIVA(double importeSinIVA) {
		this.importeSinIVA = importeSinIVA;
	}

	
	
	

}
