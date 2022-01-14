package com.medi.app.controller;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.medi.app.interfaceServices.IpatientService;
import com.medi.app.models.Medecin;
import com.medi.app.models.Medicament;
import com.medi.app.models.Patient;

@Controller	
@RequestMapping
public class Patcontroller {
	
	@Autowired
	private IpatientService service1;
	@GetMapping("/listerpa")
	public String listerp(Model model) {
		 List<Patient> p1 =service1.ListerPatient();
		 model.addAttribute("patient", p1);
		 Patient p=new Patient();
		 model.addAttribute("patient1", p);
		 Medecin m=new Medecin();
		 model.addAttribute("medecin", m);
		 model.addAttribute("medecin1", m);
		 Medicament m2=new Medicament();
		 model.addAttribute("medicament", m2);
		 model.addAttribute("medicament1", m2);
		 return "dashboard";
	}
	@GetMapping("/patt")
	@ResponseBody
	public  List<Patient> patt() {
		return service1.ListerPatient();
	}
	@PostMapping("/savepa")
	public String savep(@Valid Patient p, Model model) {
		service1.save(p);
		return "redirect:/listerpa";
	}
	@GetMapping("/supr/{id}")
	public String deletep(Model model,@PathVariable int id) {
		service1.delete(id);
		return "redirect:/listerpa";
	}
	@RequestMapping("/editpatient/{id}")
    public ModelAndView editPatient(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("listerpa");
        Patient p=service1.findmpatbyid(id);
        mav.addObject("patient", p);
        return mav;
    }
	@GetMapping("/findp")
	@ResponseBody
	public Patient findonep(int id) {
		return service1.findmpatbyid(id);
		
	}
	
}
