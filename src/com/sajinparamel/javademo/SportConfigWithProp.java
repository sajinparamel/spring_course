package com.sajinparamel.javademo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfigWithProp {
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean
	public Coach SwimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
