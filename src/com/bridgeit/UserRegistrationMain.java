package com.bridgeit;

import java.io.IOException;

public class UserRegistrationMain {

	public static void main(String[] args) throws IOException {

		PatternCheck check = new PatternCheck();
		check.firstNamePattern();
		check.lastNamePattern();
		check.emailIdPattern();
		check.phoneNumber();
		check.passwordPattern();
		check.sampleEmailsChecking();;
		check.printResult();
	}
}
