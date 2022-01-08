package com.medi.app.controller;

import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.medi.app.models.Admin;
import com.medi.app.service.Loginservice;

@Controller
public class AdminController {
	@Autowired
	private Loginservice Adservice;
	
	@GetMapping("/login")
    public ModelAndView login() {
     ModelAndView mav = new ModelAndView("login");
        mav.addObject("user", new Admin());
        return mav;
    }
	
	@PostMapping("/login")
    public String login(@ModelAttribute("user") Admin admin ) {
		Admin ad=Adservice.LoginAdmin(admin.getEmail(), admin.getPassword());
		if(Objects.nonNull(ad)){
			return "redirect:/lister";
	     }else {
			return "redirect:/login";
	    }
	}
	
	@RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
        return "redirect:/login";
    }
}