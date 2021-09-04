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

	@Test
	public void testLastNameValid_Success() {
		assertTrue(form.lastName("Saurabh"));
	}

	@Test
	public void testLastNameInValidStartCap_Fail() {
		assertFalse(form.lastName("saurabh"));
	}

	@Test
	public void testLastNameInvalidMinThreeCharacter_Fail() {
		assertFalse(form.lastName("Om"));
	}

	@Test
	public void testEmailValid_Success() {
		assertTrue(form.userEmail("abc.xyz@bl.co.in"));
	}

	@Test
	public void testNumberValid_Success() {
		assertTrue(form.userNumber("91 9370636399"));
	}

	@Test
	public void testPassValid_Success() {
		assertTrue(form.userPass("Cristaino07@#"));
	}

	@Test
	public void testPassInvalidGap_Fail() {
		assertFalse(form.userPass("Cristaino 07@#"));
	}
	@Test
	public void testPassInvalidAtleastEightCharacter_Fail() {
		assertFalse(form.userPass("Cri07@#"));
	}
	@Test
	public void testPassInvalidOneUpperCase_Fail() {
		assertFalse(form.userPass("ristaino07@#"));
	}
	@Test
	public void testPassInvalidAtLeastOneNumericNumber_Fail() {
		assertFalse(form.userPass("Cristaino@#"));
	}
	@Test
	public void testPassInvalidAtLeastOneSpecialCharacter_Fail() {
		assertFalse(form.userPass("Cristaino012"));
	}
}
