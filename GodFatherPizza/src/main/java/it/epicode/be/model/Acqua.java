package it.epicode.be.model;

public class Acqua implements Bevanda{

	@Override
	public double getCalories() {
		return 0;
	}

	@Override
	public double getPrice() {
		return 1.29;
	}

	@Override
	public String getName() {
		return "Acqua (0.5l)";
	}

}
