package it.epicode.be;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.epicode.be.model.BevandaBase;
import it.epicode.be.model.Caffe;
import it.epicode.be.model.CorrettoSambuca;
import it.epicode.be.model.MacchiatoDiLatte;
import it.epicode.be.model.Menu;

@Configuration
public class MenuConfigurator {
	
	//Per specificare che è un caffe. ({NOME}) / Oppure sostituire BevandaBase con Caffe
	@Bean({"caffe"})
	public BevandaBase getCaffe() {
		Caffe c = new Caffe();
		return c;
	}
	
	@Bean({"caffeMacchiato"})
	public BevandaBase getCaffeMacchiato() {
		return new MacchiatoDiLatte(new Caffe());
	}
	
	@Bean({"caffeCorretto"})
	public BevandaBase getCaffeCorretto() {
		return new CorrettoSambuca(new Caffe());
	}
	
	@Bean({"caffeMacchiatoCorretto"})
	public BevandaBase getCaffeMacchiatoCorretto() {
		return new CorrettoSambuca(new MacchiatoDiLatte(new Caffe()));
	}
	
	@Bean
	public Menu getMenu() {
		return new Menu();
	}

}
