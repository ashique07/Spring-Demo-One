package com.luv2code.springdemo;

public class BaseballCoach implements Coach
{
	//define private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for injecting the dependency 
	public BaseballCoach (FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
		
	}
	
	public String getDailyWorkout()
	{
		return "spend 30 minutes with bat";
		
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
