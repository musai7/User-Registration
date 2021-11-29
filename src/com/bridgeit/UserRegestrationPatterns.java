
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

public class UserRegestrationPatterns implements IRegestration{

	UserRegistration registration = new UserRegistration();

	public boolean firstNamePattern(String fName) {

		String pattern = "^[A-Z]{1}[a-z]{2,}";
			if (Pattern.matches(pattern, fName)) {
				//registration.setFirstName(fName);
				return true;	
			} else
				System.out.println("Invalid first name ");
			return false;
	}

	public boolean lastNamePattern(String lName) {

		String pattern = "^[A-Z]{1}[a-z]{2,}$";
			if (Pattern.matches(pattern, lName)) {
				//registration.setLastName(lName);
				return true;
			} else
				System.out.println("invalid last name");
			return false;
	}

	public void printResult() {
		System.out.println(registration);

	}

	public boolean emailIdPattern(String email) {

		String pattern = "^[a-zA-Z0-9]+([-_+.]?[a-zA-Z0-9])*[@]([A-Za-z0-9])+[.][A-Za-z]{2,}([.][A-Za-z]{2,}){0,1}$";
		
			if (Pattern.matches(pattern, email)) {
				//registration.setLastName(email);
				System.out.println("valide mail");
				return true;
			} else
				System.out.println("Invalid email as ");
			return false;
	}

	public boolean phoneNumber(String phoneNumber) {

		String pattern = "^[1-9]{2}[\\s][6-9][0-9]{9}$";
			if (Pattern.matches(pattern, phoneNumber)) {
				//registration.setPhoneNumber(phoneNumber);
				return true;
			} else
				System.out.println("enter valid phone number ");
			return false;
	}

	public boolean passwordPattern(String password) {

		String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
			if (Pattern.matches(pattern, password)) {
				//registration.setPassword(password);
				return true;
			} else
				System.out.println("Invalide password ");
			return false;
			
	}

	public void sampleEmailsChecking() throws IOException {
		
		String pattern = "^[a-zA-Z0-9]+([-_+.]?[a-zA-Z0-9])*[@]([A-Za-z0-9])+[.][A-Za-z]{2,}([.][A-Za-z]{2,}){0,1}$";
		String filePath = "C:\\Users\\musai\\rfp-java\\practice\\shankar rpf-80\\User-Registration\\src\\com\\bridgeit\\differentEmails";
		List<String> lines = new ArrayList<String>();
		Path path = Paths.get(filePath);
		lines = Files.readAllLines(path);

		BufferedWriter writer; 
		writer = new BufferedWriter(new FileWriter("C:\\Users\\musai\\rfp-java\\practice\\shankar rpf-80\\User-Registration\\src\\com\\bridgeit\\differentEmailsResults"));
		
		
		for (String line : lines) {
			if (Pattern.matches(pattern, line)) {
				System.out.println("EMAIL ID --> " + line + " --> VALIDE EMAIL");
				writer.write("EMAIL ID --> " + line + " --> VALIDE EMAIL \n");
			} else {
				System.out.println("EMAIL ID --> " + line + " --> INVALIDE EMAIL");
				writer.write("EMAIL ID --> " + line + " --> INVALIDE EMAIL \n");
			}
		}
		writer.close();
	}
}
