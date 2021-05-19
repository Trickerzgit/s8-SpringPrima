package it.epicode.be.model;

public class Maglietta implements FranchiseItem {

	@Override
	public double getPrice() {
		return 21.99;
	}

	@Override
	public String getName() {
		return "Maglietta";
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
