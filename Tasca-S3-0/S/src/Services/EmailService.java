package Services;

import models.User;

public class EmailService {

    void sendConfirmationEmail(User user) {
        System.out.println("📧 Sending confirmation email to: " + user.getEmail());

        boolean userConfirmed = true;
        if (!userConfirmed) {
            System.out.println("⚠️ classes.User did not confirm registration.");
            return;
        }
    }
}
