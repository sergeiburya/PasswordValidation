package mate.academy;

import java.nio.charset.StandardCharsets;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws PasswordValidationException {

        boolean checkPassNull = password != null && password != "";
        boolean equalityTwoPass = password == repeatPassword || password.equals(repeatPassword);
        boolean lengthPass = false;
        if (checkPassNull) {
            lengthPass = password.length() >= 10 && repeatPassword.length() >= 10;
        }

        if (checkPassNull && equalityTwoPass && lengthPass) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
