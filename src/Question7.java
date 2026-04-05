import java.util.*;

class PasswordChecker {

    private HashMap<String, String> users = new HashMap<>();

    // Constructor
    public PasswordChecker() {
        users.put("abc@email.com", "abc123");
        users.put("def@email.com", "def123");
    }

    // Login check
    public boolean check(String user, String pass) {
        return users.containsKey(user) && users.get(user).equals(pass);
    }

    // Add new user
    public boolean addUser(String user, String pass) {
        if (users.containsKey(user)) {
            return false; // user already exists
        }
        users.put(user, pass);
        return true;
    }
}

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordChecker obj = new PasswordChecker();

        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Register (Add User)");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Username: ");
                    String user = sc.next();

                    System.out.print("Enter Password: ");
                    String pass = sc.next();

                    if (obj.check(user, pass)) {
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid Credentials!");
                    }
                    break;

                case 2:
                    System.out.print("Enter New Username: ");
                    String newUser = sc.next();

                    System.out.print("Enter New Password: ");
                    String newPass = sc.next();

                    if (obj.addUser(newUser, newPass)) {
                        System.out.println("User Registered Successfully!");
                    } else {
                        System.out.println("User already exists!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}