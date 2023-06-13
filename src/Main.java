import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //comparison operator
        int x =10;
        int y =10;

        System.out.println(x==y);
        System.out.println(x!=y);

        //Logical  && Operator
        int age =20 ;
        boolean isEligibleToVote = age >= 18 && age <=50;
        System.out.println("Whether eligible to vote or not : " +isEligibleToVote);

        //Logical || Operator
        boolean hasCorrectweight = true;
        boolean hascorrectHeight =true;
        boolean validBmi = hascorrectHeight || hasCorrectweight;
        System.out.println(validBmi);

        //Logical ! operator
        boolean notValidBmi = !(hascorrectHeight || hasCorrectweight);
        System.out.println(notValidBmi);

        //If statements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature :");
        int temperature = scanner.nextInt();

        if(temperature >30){
            System.out.println("It's  a hot day \nDrink plenty of water");
        }
        else if (temperature>20 && temperature <=30) {
            System.out.println("It's a nice day");
        }
        else{
            System.out.println("It's a cold day");
        }

        //Ternary operator
        int personAge = 18;
        String eligible = personAge >=18 ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligible);

        //Switch statements.
        System.out.print("Enter your choice : ");
        int choice =scanner.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Addition : " +(x+y));
                break;
            case 2:
                System.out.println("Subtraction : " +(x-y));
                break;
            default:
                break;

        }

    }
}