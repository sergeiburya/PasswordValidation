package mate.academy;

public class UserService {
  public void registerUser(User user) {
    PasswordValidator validation = new PasswordValidator();
    UserService userService = new UserService();
    boolean checkValidation = false;
    try {
      if (user.getPassword() != null & user.getRepeatPassword() != null
              & user.getPassword() != "" & user.getRepeatPassword() != "") {
        validation.validate(user.getPassword(), user.getRepeatPassword());
        checkValidation = true;
      } else {
        throw new Exception ("Your passwords are incorrect. Try again.");
      }
       if (checkValidation == true & ((user.getPassword() == user.getRepeatPassword())
              || (user.getPassword().equals(user.getRepeatPassword())))) {
        userService.saveUser(new User(user.getEmail(), user.getPassword(), user.getRepeatPassword()));
      } else {
        throw new PasswordValidationException("Wrong passwords");
      }
    } catch (PasswordValidationException ex) {
        System.out.println("Your passwords are incorrect. Try again.");
    } catch (Exception e) {
      System.out.println("Your passwords are incorrect. Try again.");
    }
  }

  public void saveUser(User user){
    System.out.println("User " + user.toString() + " was saved to database!!!");
  }
}
