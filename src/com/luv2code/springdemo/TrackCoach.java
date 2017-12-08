package com.luv2code.springdemo;

public class TrackCoach implements Coach{

	private FortuneService fortuneService;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService ;
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 5K";
		
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ this.fortuneService.getFortune();
	}


}
