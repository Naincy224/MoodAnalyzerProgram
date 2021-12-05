package com.bridgeit;

public class MoodAnalysisException extends Exception {

	String error;
	
	public MoodAnalysisException() {
	 error = "Invalid Mood";
	}
	
	public String toString() {
		return ""+error;
	}
}
