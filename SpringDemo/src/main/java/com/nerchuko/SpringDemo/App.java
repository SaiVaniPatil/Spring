package com.nerchuko.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//BeanFactory factory = new XmlBeanFactory --deprecated cannot use it
    			
    			ApplicationContext factory= new ClassPathXmlApplicationContext("spring.xml");

    	Alien obj = (Alien)factory.getBean("alien");
    	//obj.age=15;
    	obj.code();
       // System.out.println( "Hello World!" );
    	
    	System.out.println(obj.getAge());
    	

    }
}
