package it.epicode.be.model;

public class Limonata implements Bevanda{

	@Override
	public double getCalories() {
		return 128;
	}

	@Override
	public double getPrice() {
		return 1.29;
	}

	@Override
	public String getName() {
		return "Limonata (0.33l)";
	}

}
