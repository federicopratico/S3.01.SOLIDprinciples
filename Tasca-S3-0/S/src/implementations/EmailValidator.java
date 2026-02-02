package implementations;

import interfaces.Validator;

public class EmailValidator implements Validator {
    @Override
    public void validate(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }
}
