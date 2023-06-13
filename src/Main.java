import java.text.NumberFormat;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final int month = 12;
        final int percent = 100;
        int principal =0;
        float monthlyRate = 0;
        int numberOfPayments=0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the principal : ");
             principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter the value between 1000 and 10000000");
        }
        while(true) {
            System.out.print("Enter the value of rate : ");
            float annualRate = scanner.nextFloat();
            if(annualRate >=1 && annualRate <=30) {
                monthlyRate = annualRate / percent / month;
                break;
            }
            System.out.println("Enter the value greater than 0 and less than or equal to 30");
        }
        while(true) {
            System.out.print("Enter the number of years : ");
            int year = scanner.nextInt();
            if (year >= 1 && year <= 30) {
                 numberOfPayments = year * month;
                break;
            }
            System.out.println("Enter the value between 1 and 30");
        }

            double mortage = principal *
                    (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                    (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

            String mortageFormat = NumberFormat.getCurrencyInstance().format(mortage);
            System.out.println("Mortage : " + mortageFormat);
        }
    }
