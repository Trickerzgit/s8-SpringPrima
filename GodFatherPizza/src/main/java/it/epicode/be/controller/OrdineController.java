package it.epicode.be.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.epicode.be.model.Ordine;

@Controller
public class OrdineController {

	@Autowired
	List<Ordine> listaOrdini;

	@GetMapping("/ordini")
	public String GetOrdini(Map<String, Object> model) {

		model.put("lista", listaOrdini);
		model.put("ordine", new Ordine());

		return "ordiniPage";
	}

	@RequestMapping(value = "cerca", method = RequestMethod.GET)
	public String cercaOrdine(@RequestParam (value = "numeroOrdine") int numero, ModelMap model) {
		for (Ordine ordine : listaOrdini) {
			if (ordine.getNumeroOrdine() == numero) {
				model.addAttribute("numero", ordine.getNumeroOrdine());
				model.addAttribute("numeroCoperti", ordine.getNumeroCoperti());
				model.addAttribute("orario", ordine.getOrario());
				model.addAttribute("ordini", ordine.getOrdini());
				model.addAttribute("totale", ordine.getSommaCosti());
				model.addAttribute("tavolo", ordine.getTavolo().getNumero());
				model.addAttribute("stato", ordine.getStatoOrdine());
			}
		}

		return "datiOrdine";
	}

}
