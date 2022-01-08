package com.medi.app.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medi.app.interfaceServices.ImedecinService;
import com.medi.app.models.Medecin;
import com.medi.app.models.Medicament;
import com.medi.app.models.Patient;

@Controller	
@RequestMapping
public class MedController {
	@Autowired
	private ImedecinService service;
	@GetMapping("/lister")
	public String lister(Model model) {
		 List<Medecin> medecin =service.ListerMedecin();
		 model.addAttribute("medecin", medecin);
		 Medecin m=new Medecin();
		 model.addAttribute("medecin1", m);
		 Medicament m2=new Medicament();
		 model.addAttribute("medicament", m2);
		 model.addAttribute("medicament1", m2);
		 Patient p=new Patient();
		 model.addAttribute("patient", p);
		
		 model.addAttribute("patient1", p);
		return "dashboard";
	}
	@GetMapping("/med")
	@ResponseBody
	public List<Medecin> ret() {
		return service.ListerMedecin();
	}
	@PostMapping("/saveme")
	public String save(@Valid Medecin m, Model model) {
		service.save(m);
		return "redirect:/lister";
	}
	@GetMapping("/sup/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/lister";
		
		
	}
	@GetMapping("/findone")
	@ResponseBody
	public Optional<Medecin> findone(int id) {
		return service.findmedbyid(id);
		
	}
	
	
}
