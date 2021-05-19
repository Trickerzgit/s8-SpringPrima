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
