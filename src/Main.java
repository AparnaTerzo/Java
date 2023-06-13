import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        // For String
        System.out.print("Enter Your Firstname : ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Your Lastname : ");
        String lastName = scanner.nextLine();
        String name = firstName +lastName;
        System.out.println("Name is " +name);
        System.out.println("Name is " +(name.trim()));

        // Integer
        System.out.print("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Age is " +age);
    }
}