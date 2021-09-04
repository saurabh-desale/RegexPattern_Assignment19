package com.blz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class RegexTest {

	 RegistrationForm form = new RegistrationForm();

	@Test
	public void testNameValid_Success() {
		assertTrue(form.firstName("Saurabh"));
	}
	@Test
	public void testNameInValidStartCap_Fail() {
		assertFalse(form.firstName("saurabh"));
	}
	@Test
	public void testNameInvalidMinThreeCharacter_Fail() {
		assertFalse(form.firstName("Om"));
	}
	
	
}
