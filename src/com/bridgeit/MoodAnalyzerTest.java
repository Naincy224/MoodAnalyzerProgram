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
	
	@Test
	public void test_message_to_return_sad_after_refactor() {
		analyser = new MoodAnalyzer(message1);
		String result = analyser.analyseMood();
		assertEquals(MoodAnalyzer.first_mood, result);
	}
	
	@Test
	public void test_message_to_return_happy_after_refactor() {
		analyser = new MoodAnalyzer(message2);
		String result = analyser.analyseMood();
		assertEquals(MoodAnalyzer.second_mood, result);
	}
	@Test
	public void test_null_message_to_return_happy() {
		analyser = new MoodAnalyzer();
		String result = analyser.analyseMood();
		assertEquals(MoodAnalyzer.second_mood, result);
	}
}
