import java.util.*;

public class MyString {
    public static void main(String[] args) {
        // String myName = "Shubham Gupta";
        // System.out.println(myName);

        Scanner sc = new Scanner(System.in);

        //input a string
        // System.out.print("Enter a string: ");
        // String text = sc.nextLine();

        // output string
        // System.out.println(text);

        //login details
        System.out.print("Enter Your E-mail: ");
        String emailid = sc.next();
        System.out.print("Enter Your Password: ");
        String Password = sc.next();

        //output
        System.out.println("Email: " + emailid);
        System.out.println("Password : " + Password.length());

    }
}
