package it.epicode.be.model;

public class Cipolla implements Condimento{
	
	@Override
	public double getCalories() {
		return 22;
	}

	@Override
	public double getPrice() {
		return 0.69;
	}

	@Override
	public String getName() {
		return "Cipolla";
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
