package com.bridgeit; 

import java.io.IOException;

public class UserRegistrationMain {

	public static void main(String[] args) throws IOException {

		PatternCheck check = new PatternCheck();
		check.firstNamePattern("Musai");
		check.lastNamePattern("Borra");
		check.emailIdPattern("musaiShankar307@gmail.com");
		check.phoneNumber("91 8463985868");
		check.passwordPattern("Kan@123");
		check.sampleEmailsChecking();
		check.printResult();
	}
}
