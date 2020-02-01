package com.sajinparamel.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String fortuneArray[] = {"I don't think it's a good day","You are going to make a record","Luck is on your side"};
		int fortuneIndex = new Random().nextInt(fortuneArray.length);
		
		return fortuneArray[fortuneIndex];
	}

}
