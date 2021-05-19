package it.epicode.be.model;

public class PizzaPersonalizzata implements Pizza{
	
	private Pizza pizza;
	private Condimento c;
	
	public PizzaPersonalizzata(Pizza pizza, Condimento c) {
		this.pizza = pizza;
		this.c = c;
	}

	@Override
	public double getCalories() {
		return pizza.getCalories() + c.getCalories();
	}

	@Override
	public double getPrice() {
		return pizza.getPrice() + c.getPrice();
		
	}

	@Override
	public String getName() {
		return pizza.getName() + " e " + c.getName();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuItem altro = (MenuItem) obj;
		if (getName() == null) {
			if (altro.getName() != null) {
				return false;
			}
			else if (!getName().equals(altro.getName()))
				return false;
		}
		return true;
	}


}
