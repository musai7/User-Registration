package com.bridgeit;

public class InvalideUserDetailsException extends Exception {

	enum ExeptionType{
		FIRST_NAME,
		LAST_NAME,
		PHONE_NUMBER,
		PASSWORD,
		EMAIL_ID
	}
	public InvalideUserDetailsException(String data) {
		
		super(data);
	}
}
