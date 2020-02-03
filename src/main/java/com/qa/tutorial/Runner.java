package com.qa.tutorial;

public class Runner {

	public static void main(String[] args) {

		Interaction interact = new Interaction();
		System.out.println(interact.greeting() + " " + interact.insult());
	}

}
