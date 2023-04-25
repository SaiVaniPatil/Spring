package com.nerchuko.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nerchuko.first.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping(value="aliens")
	public String getAliens()
	{
		
		Alien a1 = new Alien(1,"Alpha");
		Alien a2 = new Alien(2,"Beta");
		Alien a3 = new Alien(3,"theta");
				
		
		List<Alien> aliens = Arrays.asList(a1,a2,a3);
		
	
		
		return aliens.toString();
		
	}


}
