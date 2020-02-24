package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load the spring configuration file (create spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve beans from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//HappyFortuneService myFortune = new HappyFortuneService();
		//BaseballCoach myCoach = new BaseballCoach(myFortune);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());

	}

}
