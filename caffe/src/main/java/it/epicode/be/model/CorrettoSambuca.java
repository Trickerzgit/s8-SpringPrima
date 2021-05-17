package it.epicode.be.model;

public class CorrettoSambuca implements BevandaBase{
	
	private BevandaBase bevanda;
	
	public CorrettoSambuca(BevandaBase bevanda) {
		this.bevanda = bevanda;
	}

	@Override
	public double getPrezzo() {
		return bevanda.getPrezzo() + 0.50;
	}

	@Override
	public String getVoceMenu() {
		return bevanda.getVoceMenu() + ", con aggiunta di Sambuca";
	}

}
