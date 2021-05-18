package it.epicode.be.model;

import java.time.LocalTime;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;



public class Ordine {
	
	private Logger logger = LoggerFactory.getLogger(Ordine.class);
	
	private Tavolo tavolo;
	private Map<MenuItem, Integer> ordini;
	private int numeroOrdine;
	private int numeroCoperti;
	private LocalTime orario;
	private double sommaCosti;
	
	@Value("${godfatherpizza.costocoperto}")
	private double coperto;
	
	public Ordine(Tavolo tavolo, int numeroOrdine, int numeroCoperti, Map<MenuItem, Integer> ordini) {
		this.tavolo = tavolo;
		this.numeroOrdine = numeroOrdine;
		this.numeroCoperti = numeroCoperti;
		this.ordini = ordini;
		orario = LocalTime.now();
		sommaCosti = 0 + numeroCoperti * coperto;
	}
	
	public void stampa() {
		logger.info("\n\n ****** ORDINE " + this.numeroOrdine + " ******\n");
		for (Map.Entry<MenuItem, Integer> item : ordini.entrySet()) {
			logger.info(item.getKey().getName() + " Qta: " + item.getValue() + " Prezzo: " +round2(item.getKey().getPrice()) + "€\n");
		}
		logger.info("Totale: " + sommaCosti + "€");
		logger.info("Numero coperti: " + numeroCoperti);
		logger.info("Tavolo: " + tavolo.getNumero());
		logger.info("Ora: " + orario);
		
	}
	
	public void addItem(MenuItem i) {
		if (ordini.containsKey(i)) {
			int quantita = ordini.get(i);
			quantita++;
			ordini.put(i, quantita);
		}
		else {
			ordini.put(i, 1);
		}
		sommaCosti += i.getPrice();
	}
	
	public void removeItem(MenuItem i) {
		if (ordini.isEmpty()) {
			logger.warn("Ordine vuoto");
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

	public Tavolo getTavolo() {
		return tavolo;
	}

	public void setTavolo(Tavolo tavolo) {
		this.tavolo = tavolo;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public int getNumeroCoperti() {
		return numeroCoperti;
	}

	public void setNumeroCoperti(int numeroCoperti) {
		this.numeroCoperti = numeroCoperti;
	}

	public LocalTime getOrario() {
		return orario;
	}

	public void setOrario(LocalTime orario) {
		this.orario = orario;
	}

	public double getCoperto() {
		return coperto;
	}

	public void setCoperto(double coperto) {
		this.coperto = coperto;
	}

	public Map<MenuItem, Integer> getOrdini() {
		return ordini;
	}

	public void setOrdini(Map<MenuItem, Integer> ordini) {
		this.ordini = ordini;
	}

	public double getSommaCosti() {
		return sommaCosti;
	}

	public void setSommaCosti(double sommaCosti) {
		this.sommaCosti = sommaCosti;
	}
	
	private double round2 (double d) {
		return (double)Math.round(d * 100d) / 100d;
	}
	
}
