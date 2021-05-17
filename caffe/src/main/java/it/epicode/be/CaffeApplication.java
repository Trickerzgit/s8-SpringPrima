package it.epicode.be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.epicode.be.model.BevandaBase;
import it.epicode.be.model.Caffe;
import it.epicode.be.model.Menu;

@SpringBootApplication
public class CaffeApplication {
	
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(CaffeApplication.class, args);
		
		ctx = new AnnotationConfigApplicationContext(MenuConfigurator.class);
		Menu menu = ctx.getBean(Menu.class);   //Recupero Bean da container/application context Spring
		
		popolaMenu(menu);
		
		menu.stampa();
		
	}
	
	static void popolaMenu(Menu m) {
		
		Caffe c = ctx.getBean(Caffe.class);
		m.addMenu(c);
		
		BevandaBase b1 = (BevandaBase)ctx.getBean("caffeMacchiato");
		m.addMenu(b1);
		
		BevandaBase b2 = (BevandaBase)ctx.getBean("caffeCorretto");
		m.addMenu(b2);
		
		BevandaBase b3 = (BevandaBase)ctx.getBean("caffeMacchiatoCorretto");
		m.addMenu(b3);
		
	}

}
