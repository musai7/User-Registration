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

	public void emailIdPattern() {
		
		String pattern = "^[a-zA-Z0-9]+([-_+.a-zA-Z0-9])*@[A-Za-z]+.[A-Za-z]+(.[A-Za-z]{2})*$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enterEmail ID : ");
		while (true) {
			String email = scanner.nextLine();
			if (Pattern.matches(pattern, email)) {
				registration.setLastName(email);
				break;
			}
			else
				System.out.println("enter valid email as ");
		}
	}

	public void phoneNumber() {

		String pattern = "^[1-9]{2}[\\s][6-9][0-9]{9}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter phone number : ");
		while (true) {
			String phoneNumber = scanner.nextLine();
			if (Pattern.matches(pattern, phoneNumber)) {
				registration.setPhoneNumber(phoneNumber);
				break;
			}
			else
				System.out.println("enter valid phone number ");
		}
	}

	public void passwordPattern() {
		
		String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,}$";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter password with min 8 characters at least one upper case : ");
		while (true) {
			String password = scanner.nextLine();
			if (Pattern.matches(pattern, password)) {
				registration.setPassword(password);
				break;
			}
			else
				System.out.println("enter valide password ");
		}	
	}
}
