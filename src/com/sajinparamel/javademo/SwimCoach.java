package com.sajinparamel.javademo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${myEmail}")
	private String email;
	
	@Value("${myTeam}")
	private String team;

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {

		return "Swim for a long time";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}
