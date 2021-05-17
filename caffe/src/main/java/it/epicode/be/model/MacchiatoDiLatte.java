package it.epicode.be.model;

public class MacchiatoDiLatte implements BevandaBase {
	
	private BevandaBase bevanda;
	
	public MacchiatoDiLatte(BevandaBase bevanda) {
		this.bevanda = bevanda;
	}

	@Override
	public double getPrezzo() {
		return bevanda.getPrezzo() + 0;
	}

	@Override
	public String getVoceMenu() {
		return bevanda.getVoceMenu() + ", con aggiunta di latte";
	}
	
}
