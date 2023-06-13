import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int month = 12;
        final int percent = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        int principal = scanner.nextInt();

        System.out.print("Enter the value of rate : ");
        float annualRate = scanner.nextFloat();
        float monthlyRate = annualRate /percent/month;


        System.out.print("Enter the number of years : ");
        int year = scanner.nextInt();
        int numberOfPayments = year * month;

        double mortage = principal *
                (monthlyRate * Math.pow(1 + monthlyRate,numberOfPayments))/
                        (Math.pow(1 +monthlyRate,numberOfPayments) -1);

        String mortageFormat = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("Mortage : " +mortageFormat);
    }
}