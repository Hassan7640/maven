package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
@Test
public void greeetingTest() {
	Interaction interaction = new Interaction();
	assertEquals("Hi friend", interaction.greeting());
}

}
