import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 2D Array
        int[][] numbers = new int[3][2];
        numbers[0][0]=10;
        numbers[0][1]=20;
        numbers[1][0]=30;
        numbers[1][1]=240;
        System.out.println(Arrays.deepToString(numbers));

        //another method
        int[][] number= {{10,20,30},{20,70,80}};
        System.out.println(Arrays.deepToString(number));


    }
}