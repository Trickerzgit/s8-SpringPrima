package it.epicode.be;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.epicode.be.model.Acqua;
import it.epicode.be.model.Ananas;
import it.epicode.be.model.Bevanda;
import it.epicode.be.model.Cipolla;
import it.epicode.be.model.Condimento;
import it.epicode.be.model.Formaggio;
import it.epicode.be.model.FranchiseItem;
import it.epicode.be.model.Limonata;
import it.epicode.be.model.Maglietta;
import it.epicode.be.model.Menu;
import it.epicode.be.model.Ordine;
import it.epicode.be.model.Pizza;
import it.epicode.be.model.PizzaMargherita;
import it.epicode.be.model.PizzaFormatoFamiglia;
import it.epicode.be.model.PizzaHawaii;
import it.epicode.be.model.PizzaSalame;
import it.epicode.be.model.Prosciutto;
import it.epicode.be.model.Salame;
import it.epicode.be.model.StatoTavolo;
import it.epicode.be.model.Tavolo;
import it.epicode.be.model.Tazza;
import it.epicode.be.model.Vino;

@Configuration
public class MenuConfigurazione {
	
	@Bean
	@Scope("singleton")
	public Menu getMenu() {
		return new Menu();
	}
	
	@Bean({"Margherita"})
	@Scope("prototype")
	public Pizza getMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean({"Hawaii"})
	@Scope("prototype")
	public Pizza getHawaii() {
		return new PizzaHawaii(new PizzaMargherita(), new Prosciutto(), new Ananas());
	}
	
	@Bean({"SalamePizza"})
	@Scope("prototype")
	public Pizza getPizzaSalame() {
		return new PizzaSalame(new PizzaMargherita(), new Salame());
	}
	
	@Bean({"MargheritaXL"}) 
	@Scope("prototype")
	public Pizza getXL() {
		return new PizzaFormatoFamiglia(new PizzaMargherita());
	}
	
	@Bean({"PizzaXL"}) 
	@Scope("prototype")
	public Pizza getPizzaXL() {
		return new PizzaFormatoFamiglia(null);
	}
	
	@Bean({"Formaggio"})
	@Scope("prototype")
	public Condimento getFormaggio() {
		return new Formaggio();
	}
	
	@Bean({"Prosciutto"})
	@Scope("prototype")
	public Condimento getProsciutto() {
		return new Prosciutto();
	}
	
	@Bean({"Cipolla"})
	@Scope("prototype")
	public Condimento getCipolla() {
		return new Cipolla();
	}
	
	@Bean({"Ananas"})
	@Scope("prototype")
	public Condimento getAnanas() {
		return new Ananas();
	}
	
	@Bean({"Salame"})
	@Scope("prototype")
	public Condimento getSalame() {
		return new Salame();
	}
	
	@Bean({"Limonata"})
	@Scope("prototype")
	public Bevanda getLimonata() {
		return new Limonata();
	}
	
	@Bean({"Acqua"})
	@Scope("prototype")
	public Bevanda getAcqua() {
		return new Acqua();
	}
	
	@Bean({"Vino"})
	@Scope("prototype")
	public Bevanda getVino() {
		return new Vino();
	}
	
	@Bean({"Maglietta"})
	@Scope("prototype")
	public FranchiseItem getMaglietta() {
		return new Maglietta();
	}
	
	@Bean({"Tazza"}) 
	@Scope("prototype")
	public FranchiseItem getTazza() {
		return new Tazza();
	}
	
	@Bean({"Tavolo"})
	@Scope("singleton")
	public Tavolo getTavolo() {
		return new Tavolo(2, 10, StatoTavolo.OCCUPATO);
	}
	
	@Bean({"Tavolo2"})
	@Scope("singleton")
	public Tavolo getTavolo2() {
		return new Tavolo(3, 10, StatoTavolo.OCCUPATO);
	}
	
	@Bean({"Tavolo3"})
	@Scope("singleton")
	public Tavolo getTavolo3() {
		return new Tavolo(5, 10, StatoTavolo.OCCUPATO);
	}
	
	@Bean({"Ordine"})
	@Scope("singleton")
	public Ordine getOrdine() {
		return new Ordine(getTavolo(), 1, 3); 
	}
	
	@Bean({"Ordine2"})
	@Scope("prototype")
	public Ordine getOrdine2() {
		return new Ordine(getTavolo2(), 2, 4); 
	}
	
	@Bean({"Ordine3"})
	@Scope("prototype")
	public Ordine getOrdine3() {
		return new Ordine(getTavolo3(), 3, 6); 
	}
}
