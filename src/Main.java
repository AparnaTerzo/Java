import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=10;
        numbers[2]=30;
        System.out.println(Arrays.toString(numbers));

        //Another way to initialize in an array
        int[] number ={10,5,20,15,40};
        System.out.println(number.length);

        //sorting a array
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }
}