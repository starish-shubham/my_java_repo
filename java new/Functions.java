import java.util.*;

public class Functions {
    public static void printName(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = sc.nextLine();
        printName(name);
    }
}