package it.epicode.be.model;

public class Vino implements Bevanda{

	@Override
	public double getCalories() {
		return 607;
	}

	@Override
	public double getPrice() {
		return 7.49;
	}

	@Override
	public String getName() {
		return "Vino (0.75l, 13%)";
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
