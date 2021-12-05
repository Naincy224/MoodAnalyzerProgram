package com.bridgeit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

	public static MoodAnalyzer analyser;
	public String message = "i am in sad Mood";
	
	@BeforeClass
	public static void init() {
		analyser = new MoodAnalyzer();
	}
	
	@Test
	public void testMessageToReturnSad() {
		String result = analyser.analyseMood(message);
		assertEquals(MoodAnalyzer.first_mood, result);
	}
	@Test
	public void testMessageToReturnHappy() {
		String result = analyser.analyseMood(message);
		assertEquals(MoodAnalyzer.second_mood, result);
	}
	
}
