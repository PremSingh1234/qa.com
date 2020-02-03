package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	
	@Test
	public void greetingTets() {
		 Runner runner = new Runner(); {
			 //Runner.greeting().equals("Hi friend"); - Has to be static
			 assertEquals("Hi friend", runner.greeting());
		}
	}

}
