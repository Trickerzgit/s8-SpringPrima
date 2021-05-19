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
