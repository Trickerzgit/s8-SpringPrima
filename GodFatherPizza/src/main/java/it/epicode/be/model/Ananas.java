package it.epicode.be.model;

public class Ananas implements Condimento {
	
	@Override
	public double getCalories() {
		return 24;
	}

	@Override
	public double getPrice() {
		return 0.79;
	}

	@Override
	public String getName() {
		return "Ananas";
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
