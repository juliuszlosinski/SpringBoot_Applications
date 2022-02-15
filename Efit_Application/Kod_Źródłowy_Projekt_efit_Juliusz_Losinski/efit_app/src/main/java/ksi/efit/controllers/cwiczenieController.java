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

import ksi.efit.SessionAttributes;
import ksi.efit.models.cwiczenie;
import ksi.efit.models.rodzajcwiczenia;
import ksi.efit.services.cwiczenieService;
import ksi.efit.services.rodzajcwiczeniaService;

@Controller
public class cwiczenieController
{
	@Autowired
	cwiczenieService s;
	@Autowired
	rodzajcwiczeniaService r;

	@RequestMapping("cwiczenie_list")
	public String cwiczenie_list(Model model, HttpSession se)
	{
		String id=(String) se.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(id=="admin" || id.contains("admin") || id.equals("admin"))
		{
			List<cwiczenie>lc=s.findAll();
			model.addAttribute("lc", lc);
			System.err.print(lc.size());
			return "cwiczenie_list";
		}
		return "redirect:/";
	}
	
	@RequestMapping("/new_cwiczenie")
	public String showFromNewCwiczenie(Model model, HttpSession se)
	{
		String id=(String) se.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(id=="admin" || id.contains("admin") || id.equals("admin"))
		{
			cwiczenie c=new cwiczenie();
			model.addAttribute("c", c);
			List<rodzajcwiczenia>lr=r.findAll();
			model.addAttribute("lr", lr);
			return "new_cwiczenie";
		}
		return "redirect:/";
	}
	
	@PostMapping(value="/save_cwiczenie")
	public String new_cwiczenie(@ModelAttribute("cwiczenie") cwiczenie c)
	{
		if(s.findById(c.getIdcwiczenia())==null)
		{
			s.save(c);
		}
		return "redirect:/cwiczenie_list";
	}
	

	@RequestMapping("/usun_cwiczenie/{idb}")
	public String usun_cwiczenie(@PathVariable(name="idb")String idb)
	{
		s.deleteById(idb);
		return "redirect:/cwiczenie_list";
	}
}
