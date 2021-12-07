
package com.bridgeit;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegestrationPatterns implements IRegestration {

	public String fName;
	public String lName;
	public String password;
	public String phoneNumber;
	public String email;

	UserRegistration registration = new UserRegistration();

	public UserRegestrationPatterns() {

	}

	public UserRegestrationPatterns(String fName, String lName, String password, String phoneNumber, String email) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public boolean firstNamePattern() throws InvalideUserDetailsException {

		String pattern = "^[A-Z]{1}[a-z]{2,}";

		if (fName == null || fName.isEmpty()) {
			throw new InvalideUserDetailsException(InvalideUserDetailsException.ExeptionType.FIRST_NAME + " : enter valid user details");
		}
		if (Pattern.matches(pattern, fName)) {
			registration.setFirstName(fName);
			return true;
		}
		return false;
	}

	public boolean lastNamePattern() throws InvalideUserDetailsException {

		String pattern = "^[A-Z]{1}[a-z]{2,}$";
		if (lName == null || lName.isEmpty()) {
			throw new InvalideUserDetailsException(InvalideUserDetailsException.ExeptionType.LAST_NAME + "enter valid user details");
		}
		if (Pattern.matches(pattern, lName)) {
			registration.setLastName(lName);
			return true;
		}
		return false;
	}

	public void printResult() {
		System.out.println(registration);

	}

	public boolean emailIdPattern() throws InvalideUserDetailsException {

		String pattern = "^[a-zA-Z0-9]+([-_+.]?[a-zA-Z0-9])*[@]([A-Za-z0-9])+[.][A-Za-z]{2,}([.][A-Za-z]{2,}){0,1}$";
		if (email == null || email.isEmpty()) {
			throw new InvalideUserDetailsException(InvalideUserDetailsException.ExeptionType.EMAIL_ID + " : enter valid user details");
		}
		if (Pattern.matches(pattern, email)) {
			registration.setLastName(email);
			System.out.println("valide mail");
			return true;
		} else
			System.out.println("Invalid email as ");
		return false;
	}

	public boolean phoneNumber() throws InvalideUserDetailsException {

			String pattern = "^[1-9]{2}[\\s][6-9][0-9]{9}$";
			
			if(phoneNumber == null || phoneNumber.isEmpty()) {
				throw new InvalideUserDetailsException(InvalideUserDetailsException.ExeptionType.PHONE_NUMBER + " : senter valid user details");
			}
			if (Pattern.matches(pattern, phoneNumber)) {
				registration.setPhoneNumber(phoneNumber);
				return true;
			} else
				System.out.println("enter valid phone number ");
			return false;
	}

	public boolean passwordPattern() throws InvalideUserDetailsException {

		String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
		if(password == null || password.isEmpty()) {
			throw new InvalideUserDetailsException(InvalideUserDetailsException.ExeptionType.PASSWORD + " : enter valid user details");
		}
			if (Pattern.matches(pattern, password)) {
				registration.setPassword(password);
				return true;
			} else
				System.out.println("Invalide password ");
			return false;
	}
}
