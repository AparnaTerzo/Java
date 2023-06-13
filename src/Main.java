// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //addition operator
        int num1 = 10;
        int num2 = 20;

        int add = num1 + num2;
        System.out.println("Addition of " +num1+ " and " +num2+ " : " +add);

        int sub = num1 - num2;
        System.out.println("Minus of " +num1+ " and " +num2+ " : " +sub);

        int mul = num1 * num2;
        System.out.println("Product of " +num1+ " and " +num2+ " : " +mul);

        int div = num1 / num2;
        System.out.println("Division of " +num1+ " and " +num2+ " : " +div);

        int mod = num1 % num2;
        System.out.println("Modulus of " +num1+ " and " +num2+ " : " +mod);

        //Increment operator
        int x=1;
        int y=x++;
        int z=++x;
        System.out.println("The value of x is " +x);
        System.out.println("The value of y is " +y);
        System.out.println("The value of z is " +z);

        //Increment operator
        int a=5;
        int b=a--;
        int c=--a;
        System.out.println("The value of a is " +a);
        System.out.println("The value of b is " +b);
        System.out.println("The value of c is " +c);

        //Agumented Assignment operator
        int num=10;
        num +=2;
        System.out.println("value = "+num);

    }
}