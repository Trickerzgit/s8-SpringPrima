package it.epicode.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.be.model.Bevanda;
import it.epicode.be.model.Condimento;
import it.epicode.be.model.FranchiseItem;
import it.epicode.be.model.Menu;
import it.epicode.be.model.Pizza;


@SpringBootApplication
public class GodFatherPizzaApplication {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GodFatherPizzaApplication.class, args);
		
		ctx = new AnnotationConfigApplicationContext(MenuConfigurazione.class);
		Menu menu = ctx.getBean(Menu.class);
		
		


	}
	
	static void popolaMenuCibo(Menu m) {
		
		Pizza pb = (Pizza)ctx.getBean("Margherita");
		m.addPizza(pb);
		
		Pizza ph = (Pizza)ctx.getBean("Hawaii");
		m.addPizza(ph);
		
		Pizza ps = (Pizza)ctx.getBean("SalamePizza");
		m.addPizza(ps);
		
		Pizza pxl = (Pizza)ctx.getBean("MargheritaXL");
		m.addPizza(pxl);
		
		Pizza pxl2 = (Pizza)ctx.getBean("PizzaXL");
		m.addPizza(pxl2);
		
		Condimento c1 = (Condimento)ctx.getBean("Formaggio");
		m.addCondimento(c1);
		
		Condimento c2 = (Condimento)ctx.getBean("Prosciutto");
		m.addCondimento(c2);
		
		Condimento c3 = (Condimento)ctx.getBean("Cipolla");
		m.addCondimento(c3);
		
		Condimento c4 = (Condimento)ctx.getBean("Ananas");
		m.addCondimento(c4);
		
		Condimento c5 = (Condimento)ctx.getBean("Salame");
		m.addCondimento(c5);
		
		Bevanda b1 = (Bevanda)ctx.getBean("Limonata");
		m.addBevanda(b1);
		
		Bevanda b2 = (Bevanda)ctx.getBean("Acqua");
		m.addBevanda(b2);
		
		Bevanda b3 = (Bevanda)ctx.getBean("Vino");
		m.addBevanda(b3);
		
	}
	
	static void popolaMenuGadget(Menu m) {
		
		FranchiseItem f1 = (FranchiseItem)ctx.getBean("Maglietta");
		m.addGadget(f1);
		
		FranchiseItem f2 = (FranchiseItem)ctx.getBean("Tazza");
		m.addGadget(f2);
	}

}
