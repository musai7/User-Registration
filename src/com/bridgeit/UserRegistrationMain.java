package com.bridgeit; 

import java.io.IOException;

public class UserRegistrationMain {

	public static void main(String[] args) throws IOException, InvalideUserDetailsException {

		UserRegestrationPatterns check = new UserRegestrationPatterns("Musai", "Borra", "MNBjh23456*&^","9876543210", "musai@307.gmail.com");
		check.firstNamePattern();
		check.lastNamePattern();
		check.emailIdPattern();
		check.phoneNumber();
		check.passwordPattern();
		check.printResult();
	}
}
