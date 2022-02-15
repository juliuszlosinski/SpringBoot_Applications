package ksi.efit.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ksi.efit.SessionAttributes;

@Controller
public class MainController
{
	@RequestMapping("/")
	public String main(HttpSession s)
	{
		String id=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		System.err.println(id);
		if(id==null)
		{
			return "redirect:rejestracja";
		}
		else if(id=="admin" || id.equals("admin"))
		{
			return "hub_admin";
		}
		else
		{
			return "hub_uzytkownika";
		}
	}
	
	@RequestMapping("wyloguj")
	public String wyloguj(HttpSession s)
	{
		s.setAttribute(SessionAttributes.ID_UZYTKOWNIKA, null);
		s.setAttribute(SessionAttributes.ID_PLAN, null);
		return "redirect:/";
	}
	
	@RequestMapping("hub_admin")
	public String hub_admin(HttpSession s)
	{
		String id=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		return "hub_admin";
	}
	
	@RequestMapping("hub_uzytkownik")
	public String hub_uzytkownik(HttpSession s)
	{
		String id=(String) s.getAttribute(SessionAttributes.ID_UZYTKOWNIKA);
		if(id!=null && id!="admin")
		{
			return "hub_uzytkownik";
		}
		return "redirect:/";
	}

}
