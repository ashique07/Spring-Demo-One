package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	//define private field for dependency
	FortuneService fortuneService;
	String emailAddress;
	String team;
	
	public CricketCoach()
	{
		System.out.println("Inside no-arg constructor of CricketCoach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("Inside setFortuneService method of CricketCoach");
		this.fortuneService = fortuneService;
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		
		System.out.println("Inside setEmailAddress method of CricketCoach");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		
		System.out.println("Inside setTeam method of CricketCoach");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Bowl like Mashrafe";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
