package com.bridgeit;

public class MoodAnalyzer {

	static final String first_mood = "SAD"; 
	static final String second_mood = "HAPPY";
	
	public String analyseMood(String message) {
		if(message.toLowerCase().contains("sad")) {
			return first_mood;
		}else {
			
			return second_mood;
		}
	}
}
