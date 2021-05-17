package it.epicode.be.model;

public class Latte implements BevandaBase{

	@Override
	public double getPrezzo() {
		return 1.00;
	}

	@Override
	public String getVoceMenu() {
		return "Latte";
	}

}
