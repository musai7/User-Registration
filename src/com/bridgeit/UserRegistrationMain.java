package com.bridgeit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserRegistrationMain {

	List<UserRegistration> list;

	public UserRegistrationMain() {
		list = new ArrayList<>();
	}

	public static void main(String[] args) {

		UserRegistration registration = new UserRegistration();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter First Name");

		while (true) {
			String fName = scanner.next();
			if (PatternCheck.firstName(fName)) {
				registration.setFirstName(fName);
				break;
			} else {
				System.out.println("enter valid First Name as --> Xyz...");
			}
		}
		System.out.println(registration);
	}
}
