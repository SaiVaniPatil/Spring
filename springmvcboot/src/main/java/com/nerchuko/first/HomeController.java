package com.nerchuko.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nerchuko.first.model.Alien;

@Controller
public class HomeController
{
	//this will be called first before any request mapping call
	
	@ModelAttribute
	public void modelData(Model m)
	{
		m.addAttribute("name","Aliens");
	}
	@RequestMapping("/")
	public String home()
	{
		
		return "index";
		//System.out.println("home page requested");
	}
	
	@RequestMapping("add")
	public String addNum(@RequestParam("num1")int i, @RequestParam("num2") int j, Model m)
	{
		
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
		//int num3 = num1+num2;
		
		//ModelAndView mv = new ModelAndView();
		
		//mv.setViewName("result");
		
		int num3 = i+j;
		
		m.addAttribute("num3", num3);
		//HttpSession session = req.getSession();
		
		//session.setAttribute("num3", num3);
		
		return "result";
		
	}
	
	@RequestMapping("addAlien")
	public String addNum(@RequestParam("id")int pId, @RequestParam("name") String pName, Model m)
	{
		Alien a = new Alien(pId,pName);
		m.addAttribute("alien", a);
		return "alien";
		
	}
	
//	@RequestMapping("addAlienV2")
//	public String addNum(@ModelAttribute("a1") Alien a)
//	{
//				
//		return "alien";
//		
//	}
	
	//to support only get operation
//	@RequestMapping(value="addAlienV2", method=RequestMethod.GET)
//	public String addNum(@ModelAttribute("a1") Alien a)
//	{
//				
//		return "alien";
//		
//	}
	
	
	//only supports get method
//	@GetMapping(value="addAlienV2")
//	public String addNum(@ModelAttribute("a1") Alien a)
//	{
//				
//		return "alien";
//		
//	}
//	
	
	//only supports post method
	@PostMapping(value="addAlienV2")
	public String addNum(@ModelAttribute("a1") Alien a)
	{
				
		return "alien";
		
	}
	
	@GetMapping(value="getAliens")
	public String getAliens(Model m)
	{
		
		Alien a1 = new Alien(1,"Alpha");
		Alien a2 = new Alien(2,"Beta");
		Alien a3 = new Alien(3,"theta");
				
		
		List<Alien> aliens = Arrays.asList(a1,a2,a3);
		
		m.addAttribute("result", aliens);
		
		return "showAliens";
		
	}



}
