package com.bridgeit;

public class UserRegistrationMain {

	public static void main(String[] args) {

		PatternCheck check = new PatternCheck();
		check.firstNamePattern();
		check.lastNamePattern();
		check.emailIdPattern();
		check.printResult();
	}
}
