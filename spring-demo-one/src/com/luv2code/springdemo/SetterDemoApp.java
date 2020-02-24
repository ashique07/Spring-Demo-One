package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Beans for container 
		CricketCoach myCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//CricketCoach myCoach = new CricketCoach();
		//HappyFortuneService myFortune = new HappyFortuneService();
		//myCoach.setFortuneService(myFortune);
		//myCoach.setTeam("Sunrisers Hyderabad");
		//myCoach.setEmailAddress("thebestcoach@luv2code.com");
		
		//Call methods on beans
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getTeam());
		System.out.println(myCoach.getEmailAddress());
		
	}

}