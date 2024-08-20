package com.main.backendStuff;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestSignup {

	@Test
	public void testTest() throws Exception {
		String[][] sample = { { "Emman", "2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824" } };
		assertEquals(
				sample[0][1],
				new Signup().processCredentials("Emman", "hello")[1]);
		assertEquals(
				sample[0][0],
				new Signup().processCredentials("Emman", "hello")[0]);
	}

}
