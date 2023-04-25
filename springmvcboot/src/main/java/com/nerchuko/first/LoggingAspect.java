package com.nerchuko.first;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public java.util.List<com.nerchuko.first.model.Alien> com.nerchuko.first.AlienController.getAliens())")
	public void logBefore()
	{
		//System.out.println("getAliens method called");
		
		LOGGER.info("getAliens method called using logger");
	}
	
	@After("execution(public java.util.List<com.nerchuko.first.model.Alien> com.nerchuko.first.AlienController.getAliens())")
	public void logAfter()
	{
		//System.out.println("getAliens method called");
		
		LOGGER.info("getAliens method completed  using logger");
	}
	
	
	

}
