package xkaperx;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<String> idiomas = new LinkedList<>();
		idiomas.add("Frances");
		idiomas.add("Ingles");
		idiomas.add("Aleman");
		model.addAttribute("idiomas", idiomas);
		
		return "home";
	}
	
	@RequestMapping(value="/detail")
	public String mostrarDetalle(Model model) {
		
		String tituloIdioma = "Ingles";
		int duracion = 3;
		double precio = 550;
		
		model.addAttribute("titulo", tituloIdioma);
		model.addAttribute("duracion", duracion);
		model.addAttribute("precio", precio);
		return "detalle";
	}
	
}
