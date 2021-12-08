package com.bridgeit;

public class InvalideUserDetailsException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	enum ExeptionType{
		FIRST_NAME,
		LAST_NAME,
		PHONE_NUMBER,
		PASSWORD,
		EMAIL_ID,
		NULL_TYPE_EXCEPTION
	}
	
	public InvalideUserDetailsException(String data) {
		
		super(data);
	}
}
