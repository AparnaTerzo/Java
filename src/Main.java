import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        if (number % 5 == 0)
            if (number%3 ==0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        else if (number % 3 == 0){
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }


    }
}