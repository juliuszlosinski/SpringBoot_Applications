package ksi.efit.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ksi.efit.Form;
import ksi.efit.SessionAttributes;
import ksi.efit.models.cwiczenie;
import ksi.efit.models.czwartek;
import ksi.efit.models.niedziela;
import ksi.efit.models.piatek;
import ksi.efit.models.plan;
import ksi.efit.models.poniedzialek;
import ksi.efit.models.sobota;
import ksi.efit.models.sroda;
import ksi.efit.models.wtorek;
import ksi.efit.services.cwiczenieService;
import ksi.efit.services.czwartekService;
import ksi.efit.services.niedzielaService;
import ksi.efit.services.piatekService;
import ksi.efit.services.planService;
import ksi.efit.services.poniedzialekService;
import ksi.efit.services.sobotaService;
import ksi.efit.services.srodaService;
import ksi.efit.services.wtorekService;

@Controller
public class planController
{
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
	cwiczenieService cwS;
	
	
	@Autowired
	planService planService;
	
	@RequestMapping("/kupPlan")
	public String kupPlan(Model model, HttpSession s)
	{
		String idUzytkownika=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(idUzytkownika!=null || idUzytkownika.isEmpty()) {
	    model.addAttribute("form", new Form());
	    return "kupPlan";
		}
		return "redirect:/";
	}
	
	@PostMapping("/zakupPlan")
	public String zakupPlan(@ModelAttribute Form form, HttpSession s)
	{
		// 1. Uzyskanie identyifkator użytownika.
		String idUzytkownika=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(idUzytkownika==null)
		{
			return "redirect:logowanie";
		}
		
		// 2. Utworzenie planu użytkownika.
		String data_zakupu="2022-24-01", data_zakonczenia="2023-24-01";
		plan pl=new plan();
		
		pl.setIdUzytkownika(idUzytkownika);
		pl.setData_zakupu(data_zakupu);
		pl.setData_zakonczenia(data_zakonczenia);
		planService.save(pl);
		
		s.setAttribute(SessionAttributes.ID_PLAN, pl.getIdPlanu());
		System.err.println("Id planu: "+s.getAttribute("idPlanu"));
		
		// 3. Uzyskanie poprzedniego id planu.
		int idPlanu=pl.getIdPlanu();
		
		// 4. Wygenerowanie wpisów z cwieczeniami.
		List<cwiczenie>cwiczenia=cwS.findAll();
		Random rand=new Random();
		int n=3;
		
		switch(form.getCelTreningu())
		{
			case "spalanieKalorii":
				n=4;
			break;
			
			case "budowaMasy":
				n=3;
			break;
		}
		
		
		for(int i=0;i<n;i++)
		{
			if(form.isPoniedzialek())
			{
				poniedzialek pon=new poniedzialek();
				pon.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				pon.setIdPlanu(idPlanu);
				pS.save(pon);
			}
			
			if(form.isWtorek())
			{
				wtorek wt=new wtorek();
				wt.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				wt.setIdPlanu(idPlanu);
				wS.save(wt);
			}
			
			if(form.isSroda())
			{
				sroda sr=new sroda();
				sr.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				sr.setIdPlanu(idPlanu);
				sS.save(sr);
			}
			
			if(form.isCzwartek())
			{
				czwartek cw= new czwartek();
				cw.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				cw.setIdPlanu(idPlanu);
				cS.save(cw);
			}
			
			if(form.isPiatek())
			{
				piatek pt=new piatek();
				pt.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				pt.setIdPlanu(idPlanu);
				piS.save(pt);
			}
			
			if(form.isSobota())
			{
				sobota st=new sobota();
				st.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				st.setIdPlanu(idPlanu);
				soS.save(st);
			}
			
			if(form.isNiedziela()) 
			{
				niedziela nd=new niedziela();
				nd.setIdCwiczenia(cwiczenia.get(rand.nextInt(cwiczenia.size())).getIdcwiczenia());
				nd.setIdPlanu(idPlanu);
				nS.save(nd);
			}
		}
		
		System.err.println(form);
		System.err.println(idPlanu);
		return "redirect:hub_uzytkownik";
	}

	@RequestMapping("/wybierzPlan")
	public String wybierzPlan(Model model, HttpSession s)
	{
		String idUzytkownika=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(idUzytkownika!=null || !idUzytkownika.isEmpty()) {
		System.err.println("S: "+idUzytkownika);
		List<plan>plans=planService.findAll();
		List<plan>lp=new ArrayList<plan>();
		for(plan p:plans)
		{
			if(p.getIdUzytkownika().equals(idUzytkownika))
			{
				lp.add(p);
				System.err.println("Added!");
			}
		}
		model.addAttribute("lp", lp);
		model.addAttribute("p", new plan());
		return "wybierzPlan";
		}
		return "redirect:/";
	}
	
	@PostMapping("/wybierzPlan")
	public String _wybierzPlan(@ModelAttribute("plan") plan p, HttpSession s)
	{
		s.setAttribute(SessionAttributes.ID_PLAN, p.getIdPlanu());
		return "redirect:hub_uzytkownik";
	}
}
