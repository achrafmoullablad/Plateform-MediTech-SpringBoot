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
import com.medi.app.interfaceServices.ImedicamentService;
import com.medi.app.models.Medecin;
import com.medi.app.models.Medicament;
import com.medi.app.models.Patient;
@Controller	
@RequestMapping
public class MediController {
	@Autowired
	private ImedicamentService service;
	@GetMapping("/listermedic")
	public String listerM(Model model) {
		 List<Medicament> medicament =service.ListerMedicament();
		 model.addAttribute("medicament", medicament);
		 Medicament m=new Medicament();
		 model.addAttribute("medicament1", m);
		 Medecin m1=new Medecin();
		 model.addAttribute("medecin", m1);
		 model.addAttribute("medecin1", m1);
		 Patient p=new Patient();
		 model.addAttribute("patient", p);
		
		 model.addAttribute("patient1", p);
		return "dashboard";
	}
	@GetMapping("/medic")
	@ResponseBody
	 public List<Medicament> pat() {
		return service.ListerMedicament();
	 }
	@PostMapping("/savemed")
	public String save(@Valid Medicament m, Model model) {
		service.save(m);
		return "redirect:/listermedic";
	}
	@GetMapping("/supMe/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listermedic";
		
		
	}
	@GetMapping("/findM")
	@ResponseBody
	public Optional<Medicament> findone(int id) {
		return service.findmedbyid(id);
		
	}
	
}
