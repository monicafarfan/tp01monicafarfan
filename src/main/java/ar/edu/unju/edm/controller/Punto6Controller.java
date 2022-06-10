package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.Punto6;

@Controller
public class Punto6Controller {

	@GetMapping("/resolverPunto6")
	public String getPunto6Page(@RequestParam(name = "num") int num, Model model) {
		Punto6 aPunto6 = new Punto6();
		aPunto6.setNum(num);
		model.addAttribute("Punto6", aPunto6.condicionAlumno());
		model.addAttribute("NotaAlumno", num);
		return "punto6";
	}
}