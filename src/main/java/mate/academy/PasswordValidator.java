package mate.academy;

public class PasswordValidator {
    public void validate(String password, String repeatPassword) throws Exception {

        UserService userService = new UserService();

        if (password != null && repeatPassword != null && password != "" && repeatPassword != "") {

        } else {
            throw new Exception("Your passwords are incorrect. Try again.");
        }


        if ((password.length() >= 10 && repeatPassword.length() >= 10)
                && (password.equals(repeatPassword))
                && ((password == repeatPassword))) {
            return;
        } else {
            throw new PasswordValidationException("Wrong passwords");
        }

    }
}
