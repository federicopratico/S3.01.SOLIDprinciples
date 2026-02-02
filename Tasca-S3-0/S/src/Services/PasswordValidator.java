package Services;

import interfaces.FormatValidator;
import interfaces.LenghtValidator;
import models.User;


public class PasswordValidator implements LenghtValidator<User>, FormatValidator<User> {

    @Override
    public void lengthValidate(User user) {
        if(user.getPassword().length() < 8)
            throw new IllegalArgumentException("Password must be at least 8 characters long");
    }

    @Override
    public void formatValidate(User user) {
        if (!upperCaseValidation(user.getPassword()))
            throw new IllegalArgumentException("Password must contain an uppercase letter");
    }

    private boolean upperCaseValidation(String password) {
        return password.matches(".*[A-Z].*");
    }
}
