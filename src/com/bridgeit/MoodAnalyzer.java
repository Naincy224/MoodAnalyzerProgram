package com.bridgeit;

public class MoodAnalyzer {

	static final String first_mood = "SAD"; 
	static final String second_mood = "HAPPY";
	String message;
	
	public MoodAnalyzer() {
		}
	public MoodAnalyzer(String message) {
		this.message = message;
	}
	
	public String analyseMood() {
		try {
		if(message.toLowerCase().contains("sad")) {
			return first_mood;
		}else {
			
			return second_mood;
		}
		} catch(Exception ex){
			System.out.println(ex);
		}
		return "Empty String";
	}
}
