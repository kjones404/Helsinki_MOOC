import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        double numOne = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        double numTwo = Integer.parseInt(reader.nextLine());
        System.out.println("Division: " + numOne + " / " + numTwo + " = " + (numOne / numTwo));
    }
}
