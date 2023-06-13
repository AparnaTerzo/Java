import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.y=10;
        System.out.println(point1);
        System.out.println(point2);
    }
}