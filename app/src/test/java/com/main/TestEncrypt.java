package com.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSHA256 {
	@Test
	void isWorking() throws Exception {
		assertEquals("2cf24dba5fb0a30e26e83b2ac5b9e29e1b161e5c1fa7425e73043362938b9824", new Encrypt().encrypt("hello"));
		assertEquals("936a185caaa266bb9cbe981e9e05cb78cd732b0b3280eb944412bb6f8f8f07af",
				new Encrypt().encrypt("helloworld"));
		assertEquals("fbca0c6d4ddb76bfe1dff13d90179ad2eb1bb959f14124b829d012eeb0d36511",
				new Encrypt().encrypt("thisIsASecurePassword"));
	}

	@Test
	void is64InSize() throws Exception {
		String[] testWith = { "sample", "anothersample", "this is a spaced sample" };
		for (String e : testWith) {
			assertEquals(64, new Encrypt().encrypt(e).length());
		}
	}

	@Test
	void isEncryptingCorrectly() throws Exception {
		assertNotEquals(new Encrypt().encrypt("h"), new Encrypt().encrypt("he"));
		assertNotEquals(new Encrypt().encrypt("b"), new Encrypt().encrypt("be"));
	}
}
