
package com.bridgeit;

import java.io.BufferedWriter;
import java.io.FileWriter;
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

		try {
			if (Pattern.matches(pattern, fName)) {
				registration.setFirstName(fName);
				return true;
			} else
				System.out.println("Invalid first name ");
			return false;
		} catch (NullPointerException ex) {
			throw new InvalideUserDetailsException("enter valid user details");
		}
	}

	public boolean lastNamePattern() throws InvalideUserDetailsException {

		String pattern = "^[A-Z]{1}[a-z]{2,}$";
		try {
			if (Pattern.matches(pattern, lName)) {
				registration.setLastName(lName);
				return true;
			} else
				System.out.println("invalid last name");
			return false;
		} catch (Exception e) {
			throw new InvalideUserDetailsException("enter valid user details");
		}
	}

	public void printResult() {
		System.out.println(registration);

	}

	public boolean emailIdPattern() throws InvalideUserDetailsException {

		String pattern = "^[a-zA-Z0-9]+([-_+.]?[a-zA-Z0-9])*[@]([A-Za-z0-9])+[.][A-Za-z]{2,}([.][A-Za-z]{2,}){0,1}$";
		try {
			if (Pattern.matches(pattern, email)) {
				registration.setLastName(email);
				System.out.println("valide mail");
				return true;
			} else
				System.out.println("Invalid email as ");
			return false;
		} catch (Exception e) {
			throw new InvalideUserDetailsException("enter valid user details");
		}
	}

	public boolean phoneNumber() throws InvalideUserDetailsException {

		try {
			String pattern = "^[1-9]{2}[\\s][6-9][0-9]{9}$";
			if (Pattern.matches(pattern, phoneNumber)) {
				registration.setPhoneNumber(phoneNumber);
				return true;
			} else
				System.out.println("enter valid phone number ");
			return false;
		} catch (Exception e) {
			throw new InvalideUserDetailsException("enter valid user details");
		}
	}

	public boolean passwordPattern() throws InvalideUserDetailsException {

		String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
		try {
			if (Pattern.matches(pattern, password)) {
				registration.setPassword(password);
				return true;
			} else
				System.out.println("Invalide password ");
			return false;
		} catch (Exception e) {
			throw new InvalideUserDetailsException("enter valid user details");
		}
	}
}
