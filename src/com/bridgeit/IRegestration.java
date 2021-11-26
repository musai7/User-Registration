package com.bridgeit;

public interface IRegestration {
	
	public boolean firstNamePattern(String fName);

	public boolean lastNamePattern(String lName);

	public boolean phoneNumber(String phoneNumber);
	
	public boolean passwordPattern(String password );

	public boolean emailIdPattern(String email);
}
