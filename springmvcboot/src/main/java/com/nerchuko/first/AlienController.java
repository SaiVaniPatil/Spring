package com.nerchuko.first;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nerchuko.first.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@GetMapping("aliens")	
	public List<Alien> getAliens()
	{
		
		List<Alien> aliens = repo.findAll();
			
		System.out.println("fetching aliens");
		
		int i= 5/0;
		return aliens;
		
	}
	
	
	@GetMapping(path = "aliensV2", produces = "application/xml")	
	public List<Alien> getAliensV2()
	{
		
		List<Alien> aliens = repo.findAll();
			
		
		return aliens;
		
	}
	
	@GetMapping("aliens/{aid}")	
	public Alien getAlien(@PathVariable("aid") int aid)
	{
		Alien alien = repo.findById(aid).orElse(new Alien(0,""));
		
		return alien;
	}
	
	@PostMapping("aliens")	
	public Alien addAlien( Alien alien)
	{
		repo.save(alien);
		
		return alien;
	}
	
	@PostMapping(path = "aliensV2",consumes={"application/json"})	
	public Alien addAlienV2(@RequestBody Alien alien)
	{
		repo.save(alien);
		
		return alien;
	}



}
