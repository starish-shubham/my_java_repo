import java.util.Scanner;

public class b2 {

    public static void printMyName(String myName) {
        System.out.println("Your name is " + myName);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        printMyName(name);
    }
}
