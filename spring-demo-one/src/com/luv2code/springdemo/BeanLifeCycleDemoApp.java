package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//Retrieve beans from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		//HappyFortuneService myFortune = new HappyFortuneService();
		//TrackCoach myCoach = new TrackCoach(myFortune);
		
		//myCoach.doMyStartupStuff()
		
		//Call methods on beans
		System.out.println(theCoach.getDailyFortune());
		
		//Close the context
		context.close();
		
		//myCoach.doMyCleanupStuff()
		

	}

}
