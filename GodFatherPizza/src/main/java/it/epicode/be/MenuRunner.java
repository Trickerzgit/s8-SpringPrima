package it.epicode.be;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import it.epicode.be.model.Bevanda;
import it.epicode.be.model.Condimento;
import it.epicode.be.model.FranchiseItem;
import it.epicode.be.model.Menu;
import it.epicode.be.model.Ordine;
import it.epicode.be.model.Pizza;
import it.epicode.be.model.Tavolo;

@Component
public class MenuRunner implements CommandLineRunner {

	@Autowired
	private ApplicationContext ctx;
	
	
	@Value("${godfatherpizza.costocoperto}")
	private double coperto;

	@Autowired
	private Menu menu;

	@Override
	public void run(String... args) throws Exception {

	

		popolaMenuCibo(menu);
		popolaMenuGadget(menu);
		
		Tavolo t1 = (Tavolo) ctx.getBean("Tavolo");
		Tavolo t2 = (Tavolo) ctx.getBean("Tavolo2");
		Tavolo t3 = (Tavolo) ctx.getBean("Tavolo3");
		Ordine o1 = (Ordine) ctx.getBean("Ordine");
		Ordine o2 = (Ordine) ctx.getBean("Ordine2");
		Ordine o3 = (Ordine) ctx.getBean("Ordine3");
		
		List<Ordine> listaOrdini = new ArrayList<>();
		listaOrdini.add(o1);
		listaOrdini.add(o2);
		listaOrdini.add(o3);
		
		o1.addItem((Pizza) ctx.getBean("Margherita"));
		o1.addItem((Pizza) ctx.getBean("Margherita"));
		o1.addItem((Pizza) ctx.getBean("Hawaii"));
		o1.addItem((Pizza) ctx.getBean("SalamePizza"));
		
		o3.addItem((Bevanda) ctx.getBean("Limonata"));
		
		o2.addItem((FranchiseItem) ctx.getBean("Tazza"));

		o1.stampa();
		o1.getTotale(coperto);
		o2.getTotale(coperto);
		o3.getTotale(coperto);

	}

	public void popolaMenuCibo(Menu m) {

		Pizza pb = (Pizza) ctx.getBean("Margherita");
		m.addPizza(pb);

		Pizza ph = (Pizza) ctx.getBean("Hawaii");
		m.addPizza(ph);

		Pizza ps = (Pizza) ctx.getBean("SalamePizza");
		m.addPizza(ps);

		Pizza pxl = (Pizza) ctx.getBean("MargheritaXL");
		m.addPizza(pxl);

		Pizza pxl2 = (Pizza) ctx.getBean("PizzaXL");
		m.addPizza(pxl2);

		Condimento c1 = (Condimento) ctx.getBean("Formaggio");
		m.addCondimento(c1);

		Condimento c2 = (Condimento) ctx.getBean("Prosciutto");
		m.addCondimento(c2);

		Condimento c3 = (Condimento) ctx.getBean("Cipolla");
		m.addCondimento(c3);

		Condimento c4 = (Condimento) ctx.getBean("Ananas");
		m.addCondimento(c4);

		Condimento c5 = (Condimento) ctx.getBean("Salame");
		m.addCondimento(c5);

		Bevanda b1 = (Bevanda) ctx.getBean("Limonata");
		m.addBevanda(b1);

		Bevanda b2 = (Bevanda) ctx.getBean("Acqua");
		m.addBevanda(b2);

		Bevanda b3 = (Bevanda) ctx.getBean("Vino");
		m.addBevanda(b3);

	}

	public void popolaMenuGadget(Menu m) {

		FranchiseItem f1 = (FranchiseItem) ctx.getBean("Maglietta");
		m.addGadget(f1);

		FranchiseItem f2 = (FranchiseItem) ctx.getBean("Tazza");
		m.addGadget(f2);
	}

}
