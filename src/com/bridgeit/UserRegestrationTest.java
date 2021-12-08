package com.bridgeit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.Test;

public class UserRegestrationTest {

	UserRegestrationPatterns userRegestrationPatterns = new UserRegestrationPatterns();
	Scanner scanner = new Scanner(System.in);

	@Test
	public void first_Name_Pattern_Test() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter first name : ");
			return Pattern.matches(patterns.firstNamePattern, scanner.next());
		});
		assertTrue(result);
	}

	@Test
	public void first_Name_Pattern_Test1() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter negitive first name : ");
			return Pattern.matches(patterns.firstNamePattern, scanner.next());
		});
		assertFalse(result);
	}
	
	@Test
	public void first_Name_Pattern_Test3() {

		boolean result = false;
		try {
			result = userRegestrationPatterns.patternCheckFunction(patterns -> {
				return Pattern.matches(patterns.firstNamePattern, null);
			});
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
		assertFalse(result);
	}

	@Test
	public void last_Name_Pattern_Test2() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter false last name : ");
			return Pattern.matches(patterns.lastNamePattern, scanner.next());
		});

		assertFalse(result);
	}

	@Test
	public void last_Name_Pattern_Test() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter last name : ");
			return Pattern.matches(patterns.lastNamePattern, scanner.next());
		});

		assertTrue(result);
	}
	
	@Test
	public void last_Name_Pattern_Test3()  {

		boolean result = false;
		try {
			result = userRegestrationPatterns.patternCheckFunction(patterns -> {
				return Pattern.matches(patterns.lastNamePattern, null);
			});
			assertTrue(result);
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void password_Pattern_Test() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter password : ");
			return Pattern.matches(patterns.passwordPattern, scanner.next());
		});

		assertTrue(result);
	}

	@Test
	public void password_Pattern_Test2() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter false password : ");
			return Pattern.matches(patterns.passwordPattern, scanner.next());
		});

		assertFalse(result);
	}
	
	@Test
	public void password_Pattern_Test3() {

		boolean result = false;
		try {
			result = userRegestrationPatterns.patternCheckFunction(patterns -> {
				return Pattern.matches(patterns.passwordPattern, null);
			});
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}

		assertFalse(result);
	}

	@Test
	public void phone_Number_Pattern_Test() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter phone number : ");
			return Pattern.matches(patterns.phoneNumberPattern, scanner.nextLine());
		});
		assertTrue(result);
	}

	@Test
	public void phone_Number_Pattern_Test2() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter false phone number : ");
			return Pattern.matches(patterns.phoneNumberPattern, scanner.next());
		});
		assertFalse(result);
	}
	
	@Test
	public void phone_Number_Pattern_Test3() {

		boolean result =false;
		try {
			result = userRegestrationPatterns.patternCheckFunction(patterns -> {
				return Pattern.matches(patterns.phoneNumberPattern, null);
			});
			assertFalse(result);
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void email_Pattern_Test() throws InvalideUserDetailsException {
	
		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter emailId : ");
			return Pattern.matches(patterns.emailPattern, scanner.next());
		});
		assertTrue(result);
	}

	@Test
	public void email_Pattern_Test2() throws InvalideUserDetailsException {

		boolean result = userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter false emailId : ");
			return Pattern.matches(patterns.emailPattern, scanner.next());
		});
		assertFalse(result);
	}
	
	@Test
	public void email_Pattern_Test3()  {

		boolean result = true;
		try {
			result = userRegestrationPatterns.patternCheckFunction(patterns -> {
				return Pattern.matches(patterns.emailPattern, null);
			});
			assertFalse(result);
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}
}
