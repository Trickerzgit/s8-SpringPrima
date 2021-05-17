package it.epicode.be.model;

public class MacchiatoDiCaffe implements BevandaBase{
	
	private BevandaBase bevanda;
	
	public MacchiatoDiCaffe(BevandaBase bevanda) {
		this.bevanda = bevanda;
	}

	@Override
	public double getPrezzo() {
		return bevanda.getPrezzo();
	}

	@Override
	public String getVoceMenu() {
		return bevanda.getVoceMenu() + ", macchiato di caffè";
	}
	
	

}
