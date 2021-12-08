package com.bridgeit;

public class UserRegistration {

	String firstName;
	String LastName;
	String phoneNumber;
	String eMail;
	String password;
	
	static UserRegistration instance ;
	private UserRegistration() {
		
	}
	
	public static UserRegistration getInstance() {
		if(instance == null)
			instance = new UserRegistration();
		return instance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRegistration [firstName=" + firstName + ", LastName=" + LastName + ", phoneNumber=" + phoneNumber
				+ ", eMail=" + eMail + ", password=" + password + "]";
	}
}
