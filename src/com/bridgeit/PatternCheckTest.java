package com.bridgeit;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PatternCheckTest {

	static PatternCheck patternCheck;
	
	@BeforeClass
	public static void initialization() {
		patternCheck = new PatternCheck();
	}
	
	@Test
	public void first_Name_Pattern_Test() {
		
		assertTrue(patternCheck.firstNamePattern("Musai"));
	}
	
	@Test
	public void last_Name_Pattern_Test() {
		
		assertTrue(patternCheck.lastNamePattern("Borra"));
	}
	
	@Test
	public void password_Pattern_Test() {
		
		assertTrue(patternCheck.passwordPattern("MAnh@#65454"));
	}
	
	@Test
	public void phone_Number_Pattern_Test() {
		
		assertTrue(patternCheck.phoneNumber("91 9876543210"));
	}
	
	@Test
	public void email_Pattern_Test() {
		
		assertTrue(patternCheck.emailIdPattern("musaishankar307@gmail.com"));
	}
}
