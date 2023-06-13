import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        //For loops
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        System.out.print("Enter the choice : ");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:

                for(int i=1; i<=num; i++){
                    System.out.println(i);
                }
                break;
            case 2:
                System.out.println("Reverse of the number  is");
                for(int i=10; i>0; i--){
                    System.out.println(i);
                }
                break;
            case 3:
                //While loops
                int i =1;
                while(i<num){
                    System.out.print(" "+i);
                    i++;
                }
                break;
            case 4:
                String input ="";
                while(!input.equals("quit")){
                    input = scanner.next().toLowerCase();
                    if(!input.equals("quit"))
                        System.out.println(input);
                    break;
                }
                break;
            case 5:
                //Do while
                String msg = "";
                do{
                    System.out.println("Enter the message");
                    msg = scanner.next().toLowerCase();
                    System.out.println(msg);
                }while(!msg.equals("quit"));
                break;
            case 6:
                String input1 ="";
                while(!input1.equals("quit")){
                    input = scanner.next().toLowerCase();
                    if(input.equals("pass"))
                        continue;
                    if(input.equals("quit"))
                        break;
                    System.out.println(input1);
                }
                break;
            case 7:
                //for-each loop
                String[] fruits = {"apple", "Mango","grapes"};
                for(String fruit : fruits){
                    System.out.println(fruit);
                }
        }

    }
}