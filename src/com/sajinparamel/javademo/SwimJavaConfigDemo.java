package com.sajinparamel.javademo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		Coach theCoach = context.getBean("SwimCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
