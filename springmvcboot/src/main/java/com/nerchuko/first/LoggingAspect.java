package com.nerchuko.first;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(public * com.nerchuko.first.AlienController.getAliens())")
	public void log()
	{
		System.out.println("getAliens method called");
	}

}
