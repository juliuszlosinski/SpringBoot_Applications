package ksi.efit.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ksi.efit.SessionAttributes;
import ksi.efit.models.cwiczenie;
import ksi.efit.models.czwartek;
import ksi.efit.models.niedziela;
import ksi.efit.models.piatek;
import ksi.efit.models.poniedzialek;
import ksi.efit.models.sobota;
import ksi.efit.models.sroda;
import ksi.efit.models.wtorek;
import ksi.efit.services.cwiczenieService;
import ksi.efit.services.czwartekService;
import ksi.efit.services.niedzielaService;
import ksi.efit.services.piatekService;
import ksi.efit.services.poniedzialekService;
import ksi.efit.services.sobotaService;
import ksi.efit.services.srodaService;
import ksi.efit.services.wtorekService;

@Controller
public class DniController {
	@Autowired
	poniedzialekService pS;
	
	@Autowired
	wtorekService wS;
	
	@Autowired
	srodaService sS;
	
	@Autowired
	czwartekService cS;
	
	@Autowired
	piatekService piS;
	
	@Autowired
	sobotaService soS;
	
	@Autowired
	niedzielaService nS;
	
	@Autowired
	cwiczenieService nC;
	
	// CEL: Pokazanie dnia.
	public String ShowDay(Model model, HttpSession s, String day)
	{
		String id=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(id!=null && !id.isEmpty()) {
		
		// 1. Utworzenie pustego lancucha znakow.
		String res="";
		
		// 2. Uzyskanie identyfikatora planu.
		int idPlanu=(int)s.getAttribute(SessionAttributes.ID_PLAN);
		System.out.println("ID_PLANU: "+idPlanu);
		System.out.println("DZIEN: "+day);
		
		// 3. Utworzenie pustego bufora na cwiczenia.
		List<cwiczenie>lc=new ArrayList<cwiczenie>();
		
		// 4. Wykonanie odpowiednich operacji.
		switch(day)
		{
		case "poniedzialek":
			// 4.0 Uzyskanie poniedzialkow.
			List<poniedzialek>all_poniedzialek=pS.findAll();
			for(poniedzialek p: all_poniedzialek)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="poniedzialek";
			break;
			
		case "wtorek":
			// 4.0 Uzyskanie poniedzialkow.
			List<wtorek>all_wtorek=wS.findAll();
			for(wtorek p: all_wtorek)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="wtorek";
			break;
		case "sroda":
			// 4.0 Uzyskanie poniedzialkow.
			List<sroda>all_sroda=sS.findAll();
			for(sroda p: all_sroda)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="sroda";
			break;
			
		case "czwartek":
			// 4.0 Uzyskanie poniedzialkow.
			List<czwartek> all_czwartek=cS.findAll();
			for(czwartek p: all_czwartek)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="czwartek";
			break;
			
		case "piatek":
			// 4.0 Uzyskanie poniedzialkow.
			List<piatek>all_piatek=piS.findAll();
			for(piatek p: all_piatek)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="piatek";
			break;
			
		case "sobota":
			// 4.0 Uzyskanie poniedzialkow.
			List<sobota>all_sobota=soS.findAll();
			for(sobota p: all_sobota)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="sobota";
			break;
			
		case "niedziela":
			// 4.0 Uzyskanie poniedzialkow.
			List<niedziela>all_niedziela=nS.findAll();
			for(niedziela p: all_niedziela)
			{
				// 4.1 Sprawdzenie czy jest tam id planu uzytkownika.
				if(p.getIdPlanu()==idPlanu)
				{
					// 4.2 Szukanie cwiczenia wedlug id.
					lc.add(nC.findById(p.getIdCwiczenia()).get());
				}
			}
			
			// 5. Zapisanie wartosci do res.
			res="niedziela";
			break;
		}
		
		// 5. Dodanie do modelu.
		model.addAttribute("lc", lc);
		
		// 6. Zwrocenie wyniku.
		return res;
		}
		return "redirect:/";
	}
	
	@RequestMapping("/poniedzialek")
	public String getPoniedzialek(Model model, HttpSession s)
	{
		return ShowDay(model, s, "poniedzialek");
	}
	
	@RequestMapping("/wtorek")
	public String getWtorek(Model model, HttpSession s)
	{
		return ShowDay(model, s, "wtorek");
	}
	
	@RequestMapping("/sroda")
	public String getSroda(Model model, HttpSession s)
	{
		return ShowDay(model, s, "sroda");
	}
	
	@RequestMapping("/czwartek")
	public String getCzwartek(Model model, HttpSession s)
	{
		return ShowDay(model, s, "czwartek");
	}
	
	@RequestMapping("/piatek")
	public String getPiatek(Model model, HttpSession s)
	{
		return ShowDay(model, s, "piatek");
	}

	@RequestMapping("/sobota")
	public String getSobota(Model model, HttpSession s)
	{
		return ShowDay(model, s, "sobota");
	}
	
	@RequestMapping("/niedziela")
	public String getNiedziela(Model model, HttpSession s)
	{
		return ShowDay(model, s, "niedziela");
	}
}
