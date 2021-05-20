package it.epicode.be.model;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Menu {
	
	private List<Pizza> elencoOrdinabili = new ArrayList<>();
	private List<Condimento> elencoOrdinabili2 = new ArrayList<>();
	private List<Bevanda> elencoOrdinabili3 = new ArrayList<>();
	private List<FranchiseItem> elencoGadgets = new ArrayList<>();
	
	public void stampa() {
		System.out.println("\n ****** MENU' ****** \n");
		
		System.out.println(" ____ Pizze ____\n");
		for (Pizza f : elencoOrdinabili) {
			System.out.println(f.getName() + "\n" + "Prezzo: " + round2(f.getPrice()) + " Calorie: " + round2(f.getCalories()) + "\n");
		}
		System.out.println("\n\n ____ Condimenti ____\n");
		for (Condimento f3 : elencoOrdinabili2) {
			System.out.println(f3.getName() + "\n" + "Prezzo: " + round2(f3.getPrice()) + " Calorie: " + round2(f3.getCalories()) + "\n");
		}
		System.out.println("\n\n ____ Bevande ____\n");
		for (Bevanda b : elencoOrdinabili3) {
			System.out.println(b.getName() + "\n" + "Prezzo: " + round2(b.getPrice()) + " Calorie: " + round2(b.getCalories()) + "\n");
		}
		System.out.println("\n\n ____ Gadgets ____\n");
		for (FranchiseItem f2 : elencoGadgets) {
			System.out.println(f2.getName() + "\n" + "Prezzo: " + round2(f2.getPrice()) + "\n");
		}
	}
	
	public void addPizza(Pizza f) {
		elencoOrdinabili.add(f);
	}
	
	public void removePizza(Pizza f) {
		elencoOrdinabili.remove(f);
	}
	
	public void addCondimento(Condimento c) {
		elencoOrdinabili2.add(c);
	}
	
	public void removeCondimento(Condimento c) {
		elencoOrdinabili2.remove(c);
	}
	
	public void addBevanda(Bevanda b) {
		elencoOrdinabili3.add(b);
	}
	
	public void removeBevanda(Bevanda b) {
		elencoOrdinabili3.remove(b);
	}
	
	public void addGadget(FranchiseItem f) {
		elencoGadgets.add(f);
	}
	
	public void removeGadget(FranchiseItem f) {
		elencoGadgets.remove(f);
	}
	
	private double round2 (double d) {
		return (double)Math.round(d * 100d) / 100d;
	}

}
