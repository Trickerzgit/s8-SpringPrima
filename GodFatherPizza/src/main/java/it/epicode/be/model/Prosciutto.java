package it.epicode.be.model;

public class Prosciutto implements Condimento{
	
	@Override
	public double getCalories() {
		return 35;
	}

	@Override
	public double getPrice() {
		return 0.99;
	}

	@Override
	public String getName() {
		return "Prosciutto";
	}

}
