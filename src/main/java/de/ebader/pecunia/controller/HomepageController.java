package de.ebader.pecunia.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomepageController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping(value = "/")
	public ModelAndView showHomepage(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("homepage.html");
	}
	
	@GetMapping(value = "/geo")
	public ModelAndView showGeografie(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("geografie.html");
	}

}
