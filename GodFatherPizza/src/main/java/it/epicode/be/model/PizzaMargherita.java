package it.epicode.be.model;

public class PizzaMargherita implements Pizza{

	@Override
	public double getPrice() {
		return 4.99;
	}

	@Override
	public double getCalories() {
		return 1104;
	}

	@Override
	public String getName() {
		return "Pizza Margherita";
	}

}
