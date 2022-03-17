package com.example.cardapio.cardapio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.cardapio.cardapio.model.Comanda;

@Controller
public class ComandaController {

	
	@GetMapping("/register")
	public String showForm(Model model) {
        Comanda comanda = new Comanda();
        model.addAttribute("comanda", comanda);
         
        return "cardapio";
    }
	
	@PostMapping("/comanda")
	public String relatorio(@ModelAttribute("comanda") Comanda comanda ) {
		System.out.println(comanda.getQuantidade1());
		comanda.setTotal(comanda.getQuantidade1()*10+
				comanda.getQuantidade2()*12+
				comanda.getQuantidade3()*14);
		return "relatorio";
	}
}
