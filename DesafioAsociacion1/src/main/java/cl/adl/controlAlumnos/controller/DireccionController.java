package cl.adl.controlAlumnos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import cl.adl.controlAlumnos.VO.DirrecionVO;
import cl.adl.controlAlumnos.model.Direccion;
import cl.adl.controlAlumnos.service.DireccionService;


@Controller
public class DireccionController {
	
	private static final Logger log = LoggerFactory.getLogger(AlumnoController.class);
	
	@Autowired
	private DireccionService svc;
	
	
	
	// ************ CREAR ALUMNO AL FORMULARIO ("crear-alumno.HTML ")******************************
	
	@GetMapping({ "/direcciones" })
	public String direccion(Model model, @RequestParam(defaultValue = "1") Integer p) {

		model.addAttribute("VO", svc.getAllDirrecion());
		
		return "direcciones";
	}
	
	@GetMapping("/agregarForm")
	public String agregarForm(Model model) {
		
		return "crear-direccion";
	}

	@PostMapping("/crear-direccion")
	public ModelAndView agregarSubmit(@ModelAttribute Direccion direccion) {
		

		DireccionVO respuestaServicio = svc.add(direccion);
		
		
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/dirreciones"); //=====> DONDE SE REDIRECCIONA
		} else {
			return new ModelAndView("redirect:/agregarForm");
		}
	}
	
	
	

}
