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
	
	
	// add an init method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff") ;
	}
	
	// add a destory method 
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}


}
