package it.epicode.be.model;

public class PizzaFormatoFamiglia implements Pizza{
	
	private Pizza pizza;
	
	public PizzaFormatoFamiglia(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getCalories() {
		if (pizza == null) {
			return 1.95;
		}
		return pizza.getCalories() * 1.95;
	}

	@Override
	public double getPrice() {
		if (pizza == null) {
			return 4.15;
		}
		return pizza.getPrice() + 4.15;
		
	}

	@Override
	public String getName() {
		if (pizza == null) {
			return "Formato Famiglia";
		}
		return pizza.getName() + " Formato Famiglia";
	}
	
	

}
