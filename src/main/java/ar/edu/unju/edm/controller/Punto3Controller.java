package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto3;

@Controller
public class Punto3Controller {

	@GetMapping("/resolverPunto3")
	public String getPunto3Page(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			@RequestParam(name = "num3") int num3, @RequestParam(name = "num4") int num4,
			@RequestParam(name = "num5") int num5, @RequestParam(name = "num6") int num6, Model model) {

		Punto3 aPunto3 = new Punto3();
		String sipar = " es un numero par", nopar = " no es un numero par";
		aPunto3.setNumero(num1);
		if (aPunto3.esPar() == true)
			model.addAttribute("Punto3num1", sipar);
		else
			model.addAttribute("Punto3n1", nopar);

		aPunto3.setNumero(num2);
		if (aPunto3.esPar() == true)
			model.addAttribute("Punto3num2", sipar);
		else
			model.addAttribute("Punto3num2", nopar);

		aPunto3.setNumero(num3);
		if (aPunto3.esPar() == true)
			model.addAttribute("Punto3num3", sipar);
		else
			model.addAttribute("Punto3num3", nopar);

		aPunto3.setNumero(num4);
		if (aPunto3.esPar() == true)
			model.addAttribute("Punto3num4", sipar);
		else
			model.addAttribute("Punto3num4", nopar);

		aPunto3.setNumero(num5);
		if (aPunto3.esPar() == true)
			model.addAttribute("Punto3num5", sipar);
		else
			model.addAttribute("Punto3num5", nopar);

		aPunto3.setNumero(num6);
		if (aPunto3.esPar() == true)
			model.addAttribute("Punto3num6", sipar);
		else
			model.addAttribute("Punto3num6", nopar);

		// Para poder mostrar los numeros en la pagina
		model.addAttribute("par1", num1);
		model.addAttribute("par2", num2);
		model.addAttribute("par3", num3);
		model.addAttribute("par4", num4);
		model.addAttribute("par5", num5);
		model.addAttribute("par6", num6);

		return "punto3";
	}
}