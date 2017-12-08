package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve base from spring container
		Coach coach = context.getBean("myCoach", Coach.class) ;
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class) ;
	}

}
