import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String name = "Aparna";
        System.out.println("Name : " +name);

        //Concatenation of 2 strings
        String firstName = "Aparna";
        String lastName = "Venugopal";
        System.out.println("Full Name :" +firstName + lastName);

        //endsWith
        String message = "New Beginning !!";
        System.out.println("Message ends with !! :"+message.endsWith("!!"));

        //startsWith
        System.out.println("Message starts with Ne : "+message.startsWith("Ne"));

        //length
        System.out.println("The length of firstname : " +firstName.length());

        //index
        System.out.println("The indexof " +message+ " is " +message.indexOf("n"));

        //replace
        System.out.println("The new message is " +message.replace("New Beginning","Start of life"));

        //toLowercase
        System.out.println(firstName.toLowerCase());

        //toUppercase
        System.out.println(firstName.toUpperCase());

        //trim
        String address = "  chennai  ";
        System.out.println(address.trim());
    }
}