package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	//define private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach()
	{
		
	}
	
	//define constructor for injecting dependency
	public TrackCoach (FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Doura haramjada";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		//user fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	
	public void doMyStartupStuff()
	{
		System.out.println("Inside init-method of bean TrackCoach");
	}
	
	public void doMyCleanupStuff()
	{
		System.out.println("Inside init-destroy method of bean TrackCoach");
	}

}