
import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
        } else {
            System.out.println("Enter a valid number");
        }

        sc.close();
    }
}
