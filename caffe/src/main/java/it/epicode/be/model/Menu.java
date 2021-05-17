package it.epicode.be.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	
	private List<MenuItem> elencoOrdinabili = new ArrayList<MenuItem>();
	
	public void stampa() {
		System.out.println("\n ****** MENU' ****** \n");
		for (MenuItem m : elencoOrdinabili) {
			System.out.println(m.getVoceMenu() + "\t\t" + m.getPrezzo());
		}
	}
	
	public void addMenu(MenuItem m) {
		elencoOrdinabili.add(m);
	}
	
	public void removeMenu(MenuItem m) {
		elencoOrdinabili.remove(m);
	}

}
