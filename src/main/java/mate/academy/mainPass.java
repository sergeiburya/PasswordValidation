package mate.academy;

public class mainPass {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser(new User("user@mail.com", null, null));
    }
}
