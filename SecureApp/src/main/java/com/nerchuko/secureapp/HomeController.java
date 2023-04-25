package com.nerchuko.secureapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
//	@Autowired    
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
//	
	@RequestMapping("/")
	public String home(){
		
		
		return "home.jsp";
	}

}
