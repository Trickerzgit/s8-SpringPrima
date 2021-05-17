package it.epicode.be.model;

public class Cipolla implements Condimento{
	
	@Override
	public double getCalories() {
		return 22;
	}

	@Override
	public double getPrice() {
		return 0.69;
	}

	@Override
	public String getName() {
		return "Cipolla";
	}

}
