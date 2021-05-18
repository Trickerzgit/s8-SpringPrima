package it.epicode.be.model;

public class Tavolo {
	
	private int numero;
	private int numeroMax;
	private StatoTavolo stato;
	
	public Tavolo(int numero, int numeroMax, StatoTavolo stato) {
		this.numero = numero;
		this.numeroMax = numeroMax;
		this.stato = stato;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumeroMax() {
		return numeroMax;
	}

	public void setNumeroMax(int numeroMax) {
		this.numeroMax = numeroMax;
	}

	public StatoTavolo getStato() {
		return stato;
	}

	public void setStato(StatoTavolo stato) {
		this.stato = stato;
	}

}
