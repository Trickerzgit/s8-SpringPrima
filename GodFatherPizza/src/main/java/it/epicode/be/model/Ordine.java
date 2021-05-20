package it.epicode.be.model;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Slf4j
public class Ordine {
	
	private Tavolo tavolo;
	private Map<MenuItem, Integer> ordini = new HashMap<MenuItem, Integer>();
	private int numeroOrdine;
	private int numeroCoperti;
	private LocalTime orario;
	private double sommaCosti;
	private StatoOrdine statoOrdine;
	

	
	public Ordine(Tavolo tavolo, int numeroOrdine, int numeroCoperti) {
		this.tavolo = tavolo;
		this.numeroOrdine = numeroOrdine;
		this.numeroCoperti = numeroCoperti;
		orario = LocalTime.now();
	}

	public void stampa() {
		log.info("\n\n ****** ORDINE " + this.numeroOrdine + " ******\n");
		for (Map.Entry<MenuItem, Integer> item : ordini.entrySet()) {
			log.info(item.getKey().getName() + " Qta: x" + item.getValue() + " Prezzo: " +round2(item.getKey().getPrice()*item.getValue()) + "€\n");
		}
		log.info("Numero coperti: " + numeroCoperti);
		log.info("Tavolo: " + tavolo.getNumero());
		log.info("Ora: " + orario);
		
	}
	
	public void getTotale(double coperto) {
		sommaCosti += (numeroCoperti * coperto);
		log.info("Totale Ordine: " + sommaCosti+"€");
	}
	
	public void addItem(MenuItem i) {
		MenuItem presente = null;
		for (MenuItem m : ordini.keySet()) {
			if (m.equals(i)) {
				presente = m;
			}
		}
		if (presente != null) {
			ordini.put(presente, ordini.get(presente) + 1);
			sommaCosti += presente.getPrice();
		}
		else {
			ordini.put(i, 1);
			sommaCosti += i.getPrice();
		}
		
	}
	
	public void removeItem(MenuItem i) {
		if (ordini.isEmpty()) {
			log.warn("Ordine vuoto");
		}
		else {
			for (Map.Entry<MenuItem, Integer> item : ordini.entrySet()) {
				if (item.getKey().getName().equals(i.getName()) && item.getValue() > 1) {
					item.setValue(item.getValue() -1);
				}
				else {
					ordini.remove(i);
				}
			}
		}
		sommaCosti -= i.getPrice();
	}
	
	private double round2 (double d) {
		return (double)Math.round(d * 100d) / 100d;
	}
	
}
