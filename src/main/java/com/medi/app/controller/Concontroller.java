package com.medi.app.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.medi.app.interfaceServices.IconsultationService;
import com.medi.app.models.Consultation;
import com.medi.app.models.Medecin;
import com.medi.app.models.Medicament;
import com.medi.app.models.Patient;

@Controller	
@RequestMapping
public class Concontroller {
	@Autowired
	private IconsultationService service;
	@GetMapping("/listercon")
	public String listercon(Model model) {
		 List<Consultation> consultation =service.ListerConsultation();
		 model.addAttribute("consultation", consultation);
		 Consultation C=new Consultation();
		 model.addAttribute("consultation1", C);
		 Medecin m=new Medecin();
		 model.addAttribute("medecin", m);
		 model.addAttribute("medecin1", m);
		 Medicament m2=new Medicament();
		 model.addAttribute("medicament", m2);
		 model.addAttribute("medicament1", m2);
		 Patient p=new Patient();
		 model.addAttribute("patient", p);
		 model.addAttribute("patient1", p);
		return "dashboard";
	}
	@PostMapping("/savecons")
	public String save(@Valid Consultation c, Model model) {
		service.save(c);
		return "redirect:/listercon";
	}
}
