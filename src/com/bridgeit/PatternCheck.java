package com.bridgeit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternCheck {

	UserRegistration registration = new UserRegistration();
	public void firstNamePattern() {

		String pattern = "^[A-Z]{1}[a-z]{2,}";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first name");

		while (true) {
			String fName = scanner.next();
			if (Pattern.matches(pattern, fName)) {
				registration.setFirstName(fName);
				break;
			}
			else
				System.out.println("enter valid first name as -->Xyz...");
		}
	}

	public void lastNamePattern() {

		String pattern = "^[A-Z]{1}[a-z]{2,}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter last name : ");
		while (true) {
			String lName = scanner.next();
			if (Pattern.matches(pattern, lName)) {
				registration.setLastName(lName);
				break;
			}
			else
				System.out.println("enter valid last name as -->Xyz...");
		}
	}

	public void printResult() {
		System.out.println(registration);
		
	}
}
