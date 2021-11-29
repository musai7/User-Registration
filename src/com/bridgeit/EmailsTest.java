package com.bridgeit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EmailsTest {

	private String email;
	boolean expectedResult;

	private static UserRegestrationPatterns patternCheck;

	public EmailsTest(String email, boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult = expectedResult;
	}

	@BeforeClass
	public static void initialization() {
		patternCheck = new UserRegestrationPatterns();
	}

	@Parameterized.Parameters
	public static Collection input() {

		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc@abc@gmail.com", false }, { "abc.@gmail.com11", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}

	@Test
	public void email_Pattern_Test() {

		assertEquals(expectedResult,patternCheck.emailIdPattern(this.email));
	}
}
