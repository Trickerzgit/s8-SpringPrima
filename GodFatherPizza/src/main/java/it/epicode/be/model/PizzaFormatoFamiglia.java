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
