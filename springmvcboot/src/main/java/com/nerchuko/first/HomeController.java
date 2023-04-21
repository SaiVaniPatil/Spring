package com.nerchuko.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController
{
	@RequestMapping("/")
	public String home()
	{
		
		return "index.jsp";
		//System.out.println("home page requested");
	}
	
	@RequestMapping("add")
	public String addNum(HttpServletRequest req)
	{
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = num1+num2;
		
		HttpSession session = req.getSession();
		
		session.setAttribute("num3", num3);
		
		return "result.jsp";
		
	}

}
