package com.sajinparamel.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/annotationdemo/applicationContext.xml");

		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		Coach yourCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(myCoach.getDailyFortune());
		System.out.println(yourCoach.getDailyWorkout());
		context.close();
		
		
	}

}
