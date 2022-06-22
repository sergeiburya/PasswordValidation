package mate.academy;

public class UserService {
  public void registerUser(User user) {
    PasswordValidator validation = new PasswordValidator();
    UserService userService = new UserService();

    try {
        validation.validate(user.getPassword(), user.getRepeatPassword());
        userService.saveUser(new User(user.getEmail(), user.getPassword(), user.getRepeatPassword()));
    } catch (PasswordValidationException ex) {
        System.out.println("Your passwords are incorrect. Try again.");
    }
  }


  public void saveUser(User user){
    System.out.println("User " + user.toString() + " was saved to database!!!");
  }
}
