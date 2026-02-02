package Services;

import interfaces.FormatValidator;
import models.User;

public class EmailValidator implements FormatValidator<User> {

    @Override
    public void formatValidate(User user) {
        if (user.getEmail() == null || !user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }
}
