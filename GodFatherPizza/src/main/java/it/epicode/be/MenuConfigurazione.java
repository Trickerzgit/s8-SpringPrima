package it.epicode.be;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
import it.epicode.be.model.Pizza;
import it.epicode.be.model.PizzaMargherita;
import it.epicode.be.model.PizzaFormatoFamiglia;
import it.epicode.be.model.PizzaHawaii;
import it.epicode.be.model.PizzaSalame;
import it.epicode.be.model.Prosciutto;
import it.epicode.be.model.Salame;
import it.epicode.be.model.Tazza;
import it.epicode.be.model.Vino;

@Configuration
public class MenuConfigurazione {
	
	@Bean
	public Menu getMenu() {
		return new Menu();
	}
	
	@Bean({"Margherita"})
	public Pizza getMargherita() {
		return new PizzaMargherita();
	}
	
	@Bean({"Hawaii"})
	public Pizza getHawaii() {
		return new PizzaHawaii(new PizzaMargherita(), new Prosciutto(), new Ananas());
	}
	
	@Bean({"SalamePizza"})
	public Pizza getPizzaSalame() {
		return new PizzaSalame(new PizzaMargherita(), new Salame());
	}
	
	@Bean({"MargheritaXL"}) 
	public Pizza getXL() {
		return new PizzaFormatoFamiglia(new PizzaMargherita());
	}
	
	@Bean({"PizzaXL"}) 
	public Pizza getPizzaXL() {
		return new PizzaFormatoFamiglia(null);
	}
	
	@Bean({"Formaggio"})
	public Condimento getFormaggio() {
		return new Formaggio();
	}
	
	@Bean({"Prosciutto"})
	public Condimento getProsciutto() {
		return new Prosciutto();
	}
	
	@Bean({"Cipolla"})
	public Condimento getCipolla() {
		return new Cipolla();
	}
	
	@Bean({"Ananas"})
	public Condimento getAnanas() {
		return new Ananas();
	}
	
	@Bean({"Salame"})
	public Condimento getSalame() {
		return new Salame();
	}
	
	@Bean({"Limonata"})
	public Bevanda getLimonata() {
		return new Limonata();
	}
	
	@Bean({"Acqua"})
	public Bevanda getAcqua() {
		return new Acqua();
	}
	
	@Bean({"Vino"})
	public Bevanda getVino() {
		return new Vino();
	}
	
	@Bean({"Maglietta"})
	public FranchiseItem getMaglietta() {
		return new Maglietta();
	}
	
	@Bean({"Tazza"}) 
	public FranchiseItem getTazza() {
		return new Tazza();
	}
}
