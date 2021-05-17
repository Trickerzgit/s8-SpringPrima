package it.epicode.be.model;

public class PizzaHawaii implements Pizza{
	
	private Pizza base;
	private Condimento cond;
	private Condimento cond2;
	
	public PizzaHawaii(Pizza base, Condimento cond, Condimento cond2) {
		this.base = base;
		this.cond = cond;
		this.cond2 = cond2;
	}
	
	@Override
	public double getCalories() {
		return base.getCalories() + cond.getCalories() + cond2.getCalories();
	}

	@Override
	public double getPrice() {
		return base.getPrice() + cond.getPrice() + cond2.getPrice();
	}

	@Override
	public String getName() {
		return "Pizza Hawaii " + "(" + cond.getName() + ", " + cond2.getName()  + ")";
	}

}
