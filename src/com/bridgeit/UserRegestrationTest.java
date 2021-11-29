package com.bridgeit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegestrationTest {

	static UserRegestrationPatterns patterns;

	@Test
	public void first_Name_Pattern_Test() {
		patterns = new UserRegestrationPatterns(null, null, null, null, null);
		try {
			assertTrue(patterns.firstNamePattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void first_Name_Pattern_Test1() {
		patterns = new UserRegestrationPatterns("", null, null, null, null);
		try {
			assertFalse(patterns.firstNamePattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void first_Name_Pattern_Test2() {
		patterns = new UserRegestrationPatterns("Musai", null, null, null, null);
		try {
			assertTrue(patterns.firstNamePattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void last_Name_Pattern_Test() {
		patterns = new UserRegestrationPatterns("Musai", null, null, null, null);
		try {
			assertTrue(patterns.lastNamePattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void last_Name_Pattern_Test1() {
		patterns = new UserRegestrationPatterns("Musai", "", null, null, null);
		try {
			assertFalse(patterns.lastNamePattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void last_Name_Pattern_Test2() {
		patterns = new UserRegestrationPatterns("Musai", "Borra", null, null, null);
		try {
			assertTrue(patterns.lastNamePattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void password_Pattern_Test() {
		patterns = new UserRegestrationPatterns("Musai", "Borra", null, null, null);
		try {
			assertTrue(patterns.passwordPattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void password_Pattern_Test1() {
		patterns = new UserRegestrationPatterns("Musai", "", "", null, null);
		try {
			assertFalse(patterns.passwordPattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void password_Pattern_Test2() {
		patterns = new UserRegestrationPatterns("Musai", "", "MNBdfgh741@#$%", null, null);
		try {
			assertTrue(patterns.passwordPattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void phone_Number_Pattern_Test() {
		patterns = new UserRegestrationPatterns("Musai", "", "MNBdfgh741@#$%", null, null);
		try {
			assertTrue(patterns.phoneNumber());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void phone_Number_Pattern_Test1() {
		patterns = new UserRegestrationPatterns("Musai", "", "MNBdfgh741@#$%", "91 9874563210", null);
		try {
			assertTrue(patterns.phoneNumber());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void phone_Number_Pattern_Test2() {
		patterns = new UserRegestrationPatterns("Musai", "", "MNBdfgh741@#$%", "", null);
		try {
			assertFalse(patterns.phoneNumber());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void email_Pattern_Test() {
		patterns = new UserRegestrationPatterns("Musai", "", "MNBdfgh741@#$%", "91 9874563210", null);
		try {
			assertTrue(patterns.emailIdPattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void email_Pattern_Test1() {
		patterns = new UserRegestrationPatterns("Musai", "", "MNBdfgh741@#$%", "91 9874563210",
				"musaishankar307@gmail.com");
		try {
			assertTrue(patterns.emailIdPattern());
		} catch (InvalideUserDetailsException e) {
			e.printStackTrace();
		}
	}
}
