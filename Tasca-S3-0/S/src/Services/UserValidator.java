package Services;

import models.User;

public class UserValidator {

    private EmailValidator emailValidator;
    private PasswordValidator passwordValidator;

    public UserValidator(EmailValidator emailValidator, PasswordValidator passwordValidator) {
        this.emailValidator = emailValidator;
        this.passwordValidator = passwordValidator;
    }

    public void validate(User user) {
        validateEmail(user);
        validatePassword(user);
    }

    private void validateEmail(User user) {
        try {
            emailValidator.formatValidate(user);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private void validatePassword(User user) {
        try {
            passwordValidator.lengthValidate(user);
            passwordValidator.formatValidate(user);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
