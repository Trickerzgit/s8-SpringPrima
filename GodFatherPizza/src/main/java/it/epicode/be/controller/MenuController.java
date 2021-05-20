package it.epicode.be.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import it.epicode.be.model.Menu;

@Controller
public class MenuController {
	
	@Autowired
	private Menu m;
	
	
	@GetMapping("/menu")
	public String getMenu(Map<String, Object> modello) {

		modello.put("pizze", m);
		modello.put("bevande", m);
		modello.put("condimenti", m);
		modello.put("gadgets", m);
		
		return "menuPage";
	}

	
}
