package classes;

import implementations.EmailValidator;
import implementations.PasswordValidator;

public class UserRegistrator {
    private EmailValidator emailValidator;
    private PasswordValidator passwordValidator;

    public UserRegistrator() {
        emailValidator = new EmailValidator();
        passwordValidator = new PasswordValidator();
    }

    void register(User user) {

        emailValidator.validate(user.getEmail());
        passwordValidator.validate(user.getPassword());

        System.out.println("📧 Sending confirmation email to: " + user.getEmail());

        boolean userConfirmed = true;
        if (!userConfirmed) {
            System.out.println("⚠️ classes.User did not confirm registration.");
            return;
        }
    }
}
