package com.shashank.week7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory=new ClassPathXmlApplicationContext(new String[] {"camera.xml","mobile.xml","screen.xml","speaker.xml"}) ;
    	
    	Mobile mobile=(Mobile)factory.getBean("mobile") ;
    	
    	System.out.println(mobile.getCamera().getMp()) ;
    }
}
