
import java.util.Scanner;

public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check divisible by 5 or not: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 5 == 0) {
                System.out.println("The number is divisible by 5");
            } else {
                System.out.println("The number is not divisible by 5");
            }
        } else {
            System.out.println("Enter a valid number");   
        }
        sc.close();
    }
}
