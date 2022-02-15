package ksi.efit.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ksi.efit.models.cwiczenie;
import ksi.efit.models.plan;
import ksi.efit.models.uzytkownik;
import ksi.efit.services.planService;
import ksi.efit.services.uzytkownikService;

@Controller
public class uzytkownikController
{
	@Autowired
	uzytkownikService s;
	
	@Autowired
	planService pS;
	
	@GetMapping("/rejestracja")
	public String rejestracja(Model model)
	{
		uzytkownik u = new uzytkownik();
		model.addAttribute("u", u);
		return "rejestracja";
	}
	
	@RequestMapping("/lista_uzytkownikow")
	public String lista_uzytkownikow(Model model)
	{
		model.addAttribute("lu", s.findAll());
		return "lista_uzytkownikow";
	}
	
	
	@GetMapping("/dodaj_uzytkownika")
	public String dodaj_uzytkownika(Model model)
	{
		uzytkownik u = new uzytkownik();
		model.addAttribute("u", u);
		return "dodaj_uzytkownika";
	}
	
	@PostMapping(value="/dodaj_uzytkownika")
	public String dodaj_uzytkownika(@ModelAttribute("uzytkownik") uzytkownik u)
	{
		s.save(u);
		return "redirect:/lista_uzytkownikow";
	}
	
	@RequestMapping("/usun_uzytkownika/{idb}")
	public String deleteBook(@PathVariable(name="idb")String idb)
	{
		s.deleteById(idb);
		return "redirect:/lista_uzytkownikow";
	}
	
	@GetMapping("/logowanie")
	public String logowanie(Model model)
	{
		uzytkownik u = new uzytkownik();
		model.addAttribute("u", u);
		return "logowanie";
	}
	
	@PostMapping(value="/utworz_uzytkownika")
	public String utworz_uzytkownika(@ModelAttribute("uzytkownik") uzytkownik u)
	{
		s.save(u);
		return "redirect:/logowanie";
	}
	
	@PostMapping(value="/zaloguj_uzytkownika")
	public String zaloguj_uzytkownika(@ModelAttribute("uzytkownik") uzytkownik u, HttpSession session)
	{
		//s.save(u);
		System.err.println("ID"+u.getIduzytkownika());
		session.setAttribute("idUzytkownika", u.getIduzytkownika());
		if(u.getIduzytkownika().contentEquals("admin"))
		{
			return "redirect:hub_admin";
		}
		else if(s.findById(u.getIduzytkownika()).get()!=null)
		{
			List<plan>plans=pS.findAll();
			plan p=plans.get(plans.size()-1);
			session.setAttribute("idPlanu", p.getIdPlanu());
			return "redirect:hub_uzytkownik";
		}
		else
		{
			return "redirect:logowanie";
		}
	}
}
