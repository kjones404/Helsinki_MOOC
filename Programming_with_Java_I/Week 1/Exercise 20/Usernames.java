import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // get user & pwd
        System.out.println("Type your username: ");
        String user = (reader.nextLine());
        System.out.println("Type your password: ");
        String pwd = (reader.nextLine());
        // check user & pwd combo
        if (user.equals("alex") && pwd.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        } else if (user.equals("emily") && pwd.equals("cat")) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
