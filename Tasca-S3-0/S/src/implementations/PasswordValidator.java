package implementations;

import interfaces.Validator;

public class PasswordValidator implements Validator {
    @Override
    public void validate(String password) {
        if (password == null || password.length() < 8 || !password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must be at least 8 characters long and contain an uppercase letter.");
        }
    }
}
