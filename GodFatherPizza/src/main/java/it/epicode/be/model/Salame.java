package it.epicode.be.model;

public class Salame implements Condimento{
	
	@Override
	public double getCalories() {
		return 86;
	}

	@Override
	public double getPrice() {
		return 0.99;
	}

	@Override
	public String getName() {
		return "Salame";
	}

}
