package com.blz;

import java.util.regex.Pattern;

public class RegistrationForm {

	public boolean firstName(String firstName) {
		return IsValidPattern(firstName, Constants.FIRST_NAME);

	}

	public boolean lastName(String lastName) {
		return IsValidPattern(lastName, Constants.LAST_NAME);

	}

	public static boolean IsValidPattern(String input, String regex) {
		return Pattern.compile(regex).matcher(input).matches();
	}

}
