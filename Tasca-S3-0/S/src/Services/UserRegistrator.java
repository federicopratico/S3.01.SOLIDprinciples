package Services;

import models.User;

public class UserRegistrator {
    private UserValidator userValidator;
    private EmailService emailService;

    public UserRegistrator(UserValidator userValidator, EmailService emailService) {
        this.userValidator = userValidator;
        this.emailService = emailService;
    }

    void register(User user) {
        userValidator.validate(user);
        emailService.sendConfirmationEmail(user);
    }
}
