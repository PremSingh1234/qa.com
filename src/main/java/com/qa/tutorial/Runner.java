package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) {
		
		/**
		 * This method is for people you like
		 * @return a greeting
		 */
		Runner runner = new Runner();
		System.out.println(runner.greeting() + " " + runner.insult());
		
	}
	
	public String greeting() {
		return "Hi friend";
	}
	/**
	 * This method is for the classes
	 * @return a insult
	 */
	
	public String insult() {
		return "Is trash";
	}

}
