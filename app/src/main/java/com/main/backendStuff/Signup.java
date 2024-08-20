package com.main.backendStuff;

import com.main.utilities.Encrypt;

public class Signup {
	Signup() {
	}

	Signup(String username, String password) throws Exception {
		if (UserNameExists(username)) {
			throw new Exception("This username alreay exists");
		}
		String[] processePass = processCredentials(username, password);

		// call the stored procedure here to insertuser
	}

	public String[] processCredentials(String username, String password) throws Exception {
		String[] res = { username, new Encrypt().encrypt(password) };
		return res;
	}

	public Boolean UserNameExists(String username) {
		// use the stored procedure here to check if user exists
		return false;
	}

}
