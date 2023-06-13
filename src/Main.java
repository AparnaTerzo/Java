import java.text.NumberFormat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String currency=NumberFormat.getCurrencyInstance().format(789450362.98);
        System.out.println(currency);

        //percentage
        String percent = NumberFormat.getPercentInstance().format(0.099);
        System.out.println(percent);
    }
}