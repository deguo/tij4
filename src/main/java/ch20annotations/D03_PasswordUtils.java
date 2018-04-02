package ch20annotations;

import java.util.*;

public class D03_PasswordUtils {
	@D02_UseCase(id = 47, description = "Passwords must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}

	@D02_UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}

	@D02_UseCase(id = 49, description = "New passwords can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords, String password) {
		return !prevPasswords.contains(password);
	}
}