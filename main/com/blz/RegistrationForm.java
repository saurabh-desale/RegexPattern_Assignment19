package com.blz;

import java.util.regex.Pattern;

public class RegistrationForm {
//	public static void main(String[] args) {
//		RegistrationForm obj = new RegistrationForm();
//		obj.firstName("Saurabh");
//	}

	public boolean firstName(String firstName) {
		return IsValidPattern(firstName, Constants.FIRST_NAME);
		
	}

	public static boolean IsValidPattern(String input, String regex) {
		return Pattern.compile(regex).matcher(input).matches();
	}
	
}
