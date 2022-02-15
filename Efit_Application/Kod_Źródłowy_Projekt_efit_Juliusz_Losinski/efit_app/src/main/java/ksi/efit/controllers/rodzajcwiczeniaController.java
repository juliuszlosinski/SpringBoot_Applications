package ksi.efit.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksi.efit.SessionAttributes;
import ksi.efit.models.rodzajcwiczenia;
import ksi.efit.services.rodzajcwiczeniaService;

@Controller
public class rodzajcwiczeniaController
{
	@Autowired
	rodzajcwiczeniaService s;
	
	@RequestMapping("rodzajcwiczenia_list")
	public String rodzajcwiczenia_list(Model model, HttpSession se)
	{
		String id=(String) se.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(id=="admin" || id.equals("admin") || id.contains("admin")) {
		List<rodzajcwiczenia>lr=s.findAll();
		model.addAttribute("lr", lr);
		System.err.print(lr.size());
		return "rodzajcwiczenia_list";
		}
		return "redirect:/";
	}
	
	@RequestMapping("/new_rodzajcwiczenia")
	public String showFormNewRodzajCwiczenia(Model model, HttpSession se)
	{
		String id=(String) se.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(id=="admin" || id.equals("admin") || id.contains("admin")) {
		rodzajcwiczenia r = new rodzajcwiczenia();
		model.addAttribute("r", r);
		return "new_rodzajcwiczenia";
		}
		return "redirect:/";
	}
	
	@PostMapping(value="/save_rodzajcwiczenia")
	public String new_rodzajcwiczenia(@ModelAttribute("rodzajcwiczenia") rodzajcwiczenia r)
	{
		if(s.findById(r.getIdrodzajucwiczenia())==null)
		{
			s.save(r);
		}
		return "redirect:/rodzajcwiczenia_list";
	}
	
	@RequestMapping("/usun_rodzajcwiczenia/{idb}")
	public String deleteBook(@PathVariable(name="idb")String idb)
	{
		s.deleteById(idb);
		return "redirect:/rodzajcwiczenia_list";
	}
}
