package com.bridgeit;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMain {

	public static void main(String[] args) throws IOException, InvalideUserDetailsException {

		UserRegestrationPatterns userRegestrationPatterns = new UserRegestrationPatterns();

		Scanner scanner = new Scanner(System.in);

		userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter first name : ");
			return Pattern.matches(patterns.firstNamePattern, scanner.next());
		});
		userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter last name : ");
			return Pattern.matches(patterns.lastNamePattern, scanner.next());
		});
		userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter phone number : ");
			return Pattern.matches(patterns.phoneNumberPattern, scanner.next());
		});
		userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter emailId : ");
			return Pattern.matches(patterns.emailPattern, scanner.next());
		});
		userRegestrationPatterns.patternCheckFunction(patterns -> {
			System.out.println("enter password : ");
			return Pattern.matches(patterns.passwordPattern, scanner.next());
		});
	}
}
