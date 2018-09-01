import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true)
            // Request Password
            {System.out.println("Type the password: ");
            String pwd = (reader.nextLine());
            // Check for match
            if (pwd.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        // Print Secret
        System.out.println("The secret is: 42!");
    }
}
