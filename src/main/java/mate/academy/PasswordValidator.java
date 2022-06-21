package mate.academy;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {
        if (password.length() >= 10 & repeatPassword.length() >= 10) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
