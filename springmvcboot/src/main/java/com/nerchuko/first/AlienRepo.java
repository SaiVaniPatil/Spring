package com.nerchuko.first;

import org.springframework.data.jpa.repository.JpaRepository;

//import org.springframework.
import com.nerchuko.first.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer>
{
	

}