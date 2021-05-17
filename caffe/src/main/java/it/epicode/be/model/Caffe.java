package it.epicode.be.model;

public class Caffe implements BevandaBase{

	@Override
	public double getPrezzo() {
		return 0.90;
	}

	@Override
	public String getVoceMenu() {
		return "Caffè";
	}

}
