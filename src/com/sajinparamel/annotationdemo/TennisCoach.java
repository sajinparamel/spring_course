package com.sajinparamel.annotationdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
@Autowired
@Qualifier("sadFortuneService")
private FortuneService fortune;

TennisCoach(){
	System.out.println("Constructor");
}
/*	@Autowired
	public void setFortune(FortuneService fortune) {
	this.fortune = fortune;
}*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}
	@PostConstruct
	public void doMyStartup() {
		System.out.println("Starting the Application");
	}
	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Stopping the application");
	}

}
