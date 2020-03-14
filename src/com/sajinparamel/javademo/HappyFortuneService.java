package com.sajinparamel.javademo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's your Lucky day kiddo";
	}
	

}
