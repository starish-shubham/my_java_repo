
import java.util.*;

public class absoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check absolute number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("The absolute number is: " + -(n));
            } else {
                System.out.println("The absolute number is: " + n);
            }
        } else {
            System.out.println("Enter a valid number");
        }
        sc.close();
    }
}
