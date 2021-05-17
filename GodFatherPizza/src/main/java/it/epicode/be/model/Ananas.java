package it.epicode.be.model;

public class Ananas implements Condimento {
	
	@Override
	public double getCalories() {
		return 24;
	}

	@Override
	public double getPrice() {
		return 0.79;
	}

	@Override
	public String getName() {
		return "Ananas";
	}

}
