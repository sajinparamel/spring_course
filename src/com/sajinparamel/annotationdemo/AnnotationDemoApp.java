package com.sajinparamel.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config//annotationdemo/applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}

}
