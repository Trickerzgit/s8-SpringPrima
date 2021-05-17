package it.epicode.be.model;

public class Tazza implements FranchiseItem {

	@Override
	public double getPrice() {
		return 4.99;
	}

	@Override
	public String getName() {
		return "Tazza";
	}
	
	

}
