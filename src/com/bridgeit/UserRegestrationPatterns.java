
package com.bridgeit;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegestrationPatterns implements IRegestration {
	
	String firstNamePattern = "^[A-Z]{1}[a-z]{2,}";
	String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
	String phoneNumberPattern = "^[1-9]{2}[\\s][6-9][0-9]{9}$";
	String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
	String emailPattern = "^[a-zA-Z0-9]+([-_+.]?[a-zA-Z0-9])*[@]([A-Za-z0-9])+[.][A-Za-z]{2,}([.][A-Za-z]{2,}){0,1}$";

	public boolean patternCheckFunction(Predicate<UserRegestrationPatterns> predicate) throws InvalideUserDetailsException {
		
		UserRegestrationPatterns regestrationPatterns = new UserRegestrationPatterns();
		try {
		if(predicate.test(regestrationPatterns)) {
			System.out.println("true");
			return true;
		}
		System.out.println("enter valid user details ");
		return false;
		}catch(NullPointerException exception) {
			throw new InvalideUserDetailsException(InvalideUserDetailsException.ExeptionType.NULL_TYPE_EXCEPTION + " : ENTER VALID DETILS");
		}
	}	
}
