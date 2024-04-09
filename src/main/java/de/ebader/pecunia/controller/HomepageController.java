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
	
	@GetMapping(value = "/imp")
	public ModelAndView showImpressum(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("impressum.html");
	}
	
	@GetMapping(value = "/kon")
	public ModelAndView showKontakt(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("kontakt.html");
	}
	
	@GetMapping(value = "/faq")
	public ModelAndView showFAQ(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("faq.html");
	}
	
	@GetMapping(value = "/news")
	public ModelAndView showNews(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("news.html");
	}
	
	@GetMapping(value = "/pol")
	public ModelAndView showPolitik(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("politik.html");
	}
	
	@GetMapping(value = "/stats")
	public ModelAndView showStatistiken(Model model) {
		model.addAttribute("appName", appName);
		return new ModelAndView("statistik.html");
	}

}
