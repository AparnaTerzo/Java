// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.lang.*;
public class Main {
    public static void main(String[] args) {

        //Implicit casting
        //byte > short> int > long > float > double
        short x=3;
        int y= x+3;
        System.out.println("value of y = "+y);

        //Wrapper classes
        String a= "3";
        int b  = Integer.parseInt(a) +5;
        System.out.println("Value of b = "+b);

        String msg= "3.5";
        float c  = Float.parseFloat(msg) +5;
        System.out.println("Value of c = "+c);

        String msg1= "3.1";
        double d  = Double.parseDouble(msg1) +5;
        System.out.println("Value of d = "+d);
    }
}