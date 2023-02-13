package AssignmentDSA;
import java.util.Scanner;

class Login {
    public static final String USER_ID = "Ajay";
    public static final String PASSWORD = "password";
    
    public String loginUser(String user, String pass) {
        if (USER_ID.equals(user) && PASSWORD.equals(pass)) {
            return "Welcome " + user;
        } else {
            return "You have entered wrong credentials, please enter the right credentials.";
        }
    }
}

public class Assignment1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        int attempts = 0;
        
        while (attempts < 3) {
            System.out.print("Enter userId: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();
            String result = login.loginUser(user, pass);
            if (result.equals("Welcome " + Login.USER_ID)) {
                System.out.println(result);
                break;
            } else {
                System.out.println(result);
                attempts++;
                if (attempts == 3) {
                    System.out.println("You have entered wrong credentials 3 times");
                    System.out.println("Contact Admin");
                }
            }
        }
        sc.close();
    }
}
