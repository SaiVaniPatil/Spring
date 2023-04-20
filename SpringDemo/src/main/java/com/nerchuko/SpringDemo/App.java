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
    			
    			ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	BeanFactory factory = (BeanFactory) context;
    	Alien obj = (Alien)factory.getBean("alien");
    	obj.code();
       // System.out.println( "Hello World!" );
    }
}
