package it.epicode.be.model;

public class Formaggio implements Condimento{

	@Override
	public double getCalories() {
		return 92;
	}

	@Override
	public double getPrice() {
		return 0.69;
	}

	@Override
	public String getName() {
		return "Formaggio";
	}

}
