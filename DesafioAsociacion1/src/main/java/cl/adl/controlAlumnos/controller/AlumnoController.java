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
import cl.adl.controlAlumnos.VO.AlumnoVO;
import cl.adl.controlAlumnos.model.Alumno;
import cl.adl.controlAlumnos.service.AlumnoService;


@Controller
public class AlumnoController {
	
	private static final Logger log = LoggerFactory.getLogger(AlumnoController.class);
	
	@Autowired
	private AlumnoService svc;
	
	
	
	// ************ CREAR ALUMNO AL FORMULARIO ("crear-alumno.HTML ")******************************
	
	@GetMapping({ "/alumnos" })
	public String alumnos(Model model, @RequestParam(defaultValue = "1") Integer p) {

		model.addAttribute("VO", svc.getAllAlumno());
		
		return "alumnos";
	}
	
	@GetMapping("/agregarForm")
	public String agregarForm(Model model) {
		
		return "crear-alumno";
	}

	@PostMapping("/crear-alumno")
	public ModelAndView agregarSubmit(@ModelAttribute Alumno alumno) {
		

		AlumnoVO respuestaServicio = svc.add(alumno);
		
		
		if (respuestaServicio.getCodigo().equals("0")) {
			return new ModelAndView("redirect:/alumnos"); //=====> DONDE SE REDIRECCIONA
		} else {
			return new ModelAndView("redirect:/agregarForm");
		}
	}
	
	
	

}
