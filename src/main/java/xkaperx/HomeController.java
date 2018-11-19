package xkaperx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xkaperx.model.Idioma;


@Controller

public class HomeController {
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		List<Idioma> idiomas = getLista();
	   // idiomas.add("Frances");
	   // idiomas.add("Ingles");
	   // idiomas.add("Aleman");
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
	
	//Metodo para generar una lista de objetos de Modelo (Pelicula)
	private List<Idioma>getLista(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Idioma> lista = null;
		try {
			lista = new LinkedList<>();
			
			Idioma idioma1 = new Idioma();
			idioma1.setId(1);
			idioma1.setTitulo("Frances");			
			idioma1.setDuracion(5);
			idioma1.setDetalle("Gui messie");
			idioma1.setFechaInicio(formatter.parse("20-01-2019"));
			
			Idioma idioma2 = new Idioma();
			idioma2.setId(2);
			idioma2.setTitulo("Ingles");			
			idioma2.setDuracion(7);
			idioma2.setDetalle("Whats up");
			idioma2.setFechaInicio(formatter.parse("20-03-2019"));
			
			Idioma idioma3 = new Idioma();
			idioma3.setId(3);
			idioma3.setTitulo("Aleman");			
			idioma3.setDuracion(5);
			idioma3.setDetalle("Du riech");
			idioma3.setFechaInicio(formatter.parse("20-08-2019"));
			
			//Objetos Idioma a la lista
			lista.add(idioma1);
			lista.add(idioma2);
			lista.add(idioma3);
			
			return lista;			
		} catch (ParseException e) {
			System.out.println("Error: " + e.getMessage());
			return null;
		}
	}
	
}
