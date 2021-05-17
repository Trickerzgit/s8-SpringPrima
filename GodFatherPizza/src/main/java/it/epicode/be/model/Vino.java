package it.epicode.be.model;

public class Vino implements Bevanda{

	@Override
	public double getCalories() {
		return 607;
	}

	@Override
	public double getPrice() {
		return 7.49;
	}

	@Override
	public String getName() {
		return "Vino (0.75l, 13%)";
	}

}
