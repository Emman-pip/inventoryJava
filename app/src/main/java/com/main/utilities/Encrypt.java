package com.main.utilities;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Encrypt {
	public String encrypt(String code) throws Exception {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		digest.update(code.getBytes(java.nio.charset.StandardCharsets.UTF_8));
		byte[] hashed = digest.digest();
		String res = String.format("%64x", new BigInteger(1, hashed));
		return res;
	};
}
