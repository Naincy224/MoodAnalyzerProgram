package com.bridgeit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

	public static MoodAnalyzer analyser;
	public String message1 = "i am in sad Mood";
	public String message2 = "i am in happy Mood";
	
	@BeforeClass
	public static void init() {
		analyser = new MoodAnalyzer();
	}
	//Test case refactor1.1
	@Test
	public void testMessageToReturnSad() {
		String result = analyser.analyseMood(message1);
		assertEquals(MoodAnalyzer.first_mood, result);
	}
	//Test case refactor1.2
	@Test
	public void testMessageToReturnHappy() {
		String result = analyser.analyseMood(message2);
		assertEquals(MoodAnalyzer.second_mood, result);
	}
	
}
