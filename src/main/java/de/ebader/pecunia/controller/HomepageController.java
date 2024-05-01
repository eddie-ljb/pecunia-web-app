package de.ebader.pecunia.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import de.ebader.pecunia.entities.inventar.InventarMinecraft;
import de.ebader.pecunia.entities.inventar.SpielerInventur;
import de.ebader.pecunia.services.InventarService;

@Controller
public class HomepageController {
	
	@Value("${spring.application.name}")
	String appName;
	
	@Autowired
	InventarService inventarService;
	

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
		model.addAttribute("zeit_aktuell", LocalDate.now());
		List<InventarMinecraft> inventarListe = inventarService.getAllInventarEintraegeFuerDatum(Date.valueOf(LocalDate.now()));
		List<SpielerInventur> spielerInventare = inventarService.getAlleSpielerInventarFuerBestimmtesDatum(Date.valueOf(LocalDate.now()));
		model.addAttribute("inventarListe", inventarListe);
		model.addAttribute("spielerInventare", spielerInventare);
		return new ModelAndView("statistik.html");
	}
	

}
