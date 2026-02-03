### What was wrong?
The User class was violating the Single Responsibility Principle (SPR) because of the existence of the method
***void register()***.

### Why did it violate the principle?
The ***void register()*** method has too many responsibilities:
* It handles email validation;
* It handles password validation;
* It manages sending the registration confirmation email.

### What solution did you apply and why?
La The implemented solution was to give the register method the sole responsibility of handling the registration process,\
delegating the specific execution steps to other entities.
Specifically:
* ***UserValidator*** _(handles user validation tasks through the composition of two other classes)_:
  * ***PasswordValidator*** _(performs password validation)_
  * ***EmailValidator*** _(performs email validation)_
* ***EmailService*** _(responsible for sending the confirmation email)_
* ***UserRegistrator*** _(manages user registration by composing the classes mentioned above)_

Interfaces were also implemented to generalize the specific validation logic for both emails and passwords.