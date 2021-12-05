package com.bridgeit;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

	public static MoodAnalyzer analyser;
	public String message = "i am in Sad Mood";
	
	@BeforeClass
	public static void init() {
		analyser = new MoodAnalyzer();
	}
	
	@Test
	public void test_message_to_return_sad() {
		String result = analyser.analyseMood(message);
		assertEquals(MoodAnalyzer.first_mood, result);
	}
	
}
