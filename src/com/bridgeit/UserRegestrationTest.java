package com.bridgeit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegestrationTest {

	static UserRegestrationPatterns patternCheck;
	
	@BeforeClass
	public static void initialization() {
		patternCheck = new UserRegestrationPatterns();
	}
	
	@Test
	public void first_Name_Pattern_Test() {
		
		assertTrue(patternCheck.firstNamePattern("Musai"));	
	}
	
	@Test
	public void first_Name_Pattern_Test1() {
		
		assertFalse(patternCheck.firstNamePattern("sdfghj"));	
	}
	
	
	@Test
	public void first_Name_Pattern_Test2() {
		
		assertFalse(patternCheck.firstNamePattern("sd fghj"));	
	}
	@Test
	public void last_Name_Pattern_Test() {
		
		assertTrue(patternCheck.lastNamePattern("Borra"));
	}
	
	@Test
	public void last_Name_Pattern_Test1() {
		
		assertFalse(patternCheck.lastNamePattern("741"));
	}
	
	
	@Test
	public void last_Name_Pattern_Test2() {
		
		assertFalse(patternCheck.lastNamePattern("Mani "));
	}
	
	@Test
	public void password_Pattern_Test() {
		
		assertTrue(patternCheck.passwordPattern("MAnh@#65454"));
	}
	
	@Test
	public void password_Pattern_Test1() {
		
		assertFalse(patternCheck.passwordPattern("asdfghj7410"));
	}
	
	@Test
	public void password_Pattern_Test2() {
		
		assertFalse(patternCheck.passwordPattern("hj7 410"));
	}
	
	@Test
	public void phone_Number_Pattern_Test() {
		
		assertTrue(patternCheck.phoneNumber("91 9876543210"));
	}
	
	@Test
	public void phone_Number_Pattern_Test1() {
		
		assertFalse(patternCheck.phoneNumber("919876543210"));
	}
	
	@Test
	public void phone_Number_Pattern_Test2() {
		
		assertFalse(patternCheck.phoneNumber("91987 6543 210"));
	}
	
	@Test
	public void email_Pattern_Test() {
		
		assertTrue(patternCheck.emailIdPattern("musaishankar307@gmail.com"));
	}
	
	@Test
	public void email_Pattern_Test1() {
		
		assertFalse(patternCheck.emailIdPattern("musaishankar@gmail307@gmail.com"));
	}
}
