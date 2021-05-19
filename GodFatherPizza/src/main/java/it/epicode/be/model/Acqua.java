package it.epicode.be.model;

public class Acqua implements Bevanda{

	@Override
	public double getCalories() {
		return 0;
	}

	@Override
	public double getPrice() {
		return 1.29;
	}

	@Override
	public String getName() {
		return "Acqua (0.5l)";
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
