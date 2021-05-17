package it.epicode.be.model;

public class PizzaSalame implements Pizza {
	
	private Pizza base;
	private Condimento cond;
	
	public PizzaSalame(Pizza base, Condimento cond) {
		this.base = base;
		this.cond = cond;
	}
	
	@Override
	public double getCalories() {
		return base.getCalories() + cond.getCalories();
	}

	@Override
	public double getPrice() {
		return base.getPrice() + cond.getPrice();
	}

	@Override
	public String getName() {
		return "Pizza Salame " + "(" + cond.getName() + ")";
	}
	
}
