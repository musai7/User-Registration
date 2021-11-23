package com.bridgeit;

import java.util.regex.Pattern;

public class PatternCheck {

	public static boolean firstName(String fName) {

		String pattern = "^[A-Z]{1}[a-z]{2,}";
		if (Pattern.matches(pattern, fName)) {
			return true;
		}
		return false;
	}
}
