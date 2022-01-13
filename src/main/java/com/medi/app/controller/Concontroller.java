package com.medi.app.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.medi.app.interfaceServices.IconsultationService;
import com.medi.app.interfaceServices.ImedecinService;
import com.medi.app.interfaceServices.ImedicamentService;
import com.medi.app.interfaceServices.IpatientService;
import com.medi.app.models.Consultation;
import com.medi.app.models.Medecin;
import com.medi.app.models.Medicament;
import com.medi.app.models.Patient;

@Controller	
@RequestMapping
public class Concontroller {
	@Autowired
	private ImedicamentService servic3;
	@Autowired
	private IpatientService service2;
	@Autowired
	private ImedecinService service1;
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

	public String save(@Valid Consultation c, Model model,@RequestParam int idp,@RequestParam int idm,@RequestParam int idmedi) {
		Medecin med =service1.findmedbyid(idm).get();
		Patient pat = service2.findmpatbyid(idp).get();
		Medicament medi =servic3.findmedbyid(idmedi).get();
		c.setMedecin(med);
		Date date = new Date(); // This object contains the current date value
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		c.setDate(date);
		c.setMedicament(medi);
		c.setPatient(pat);
		service.save(c);
		return "redirect:/listercon";
	}
	@GetMapping("/findcon/{id}")
	@ResponseBody
	public Consultation findone(@PathVariable int id) {
		return service.findconbyid(id);
		
	}
}
