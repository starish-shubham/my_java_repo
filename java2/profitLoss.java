
import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter the selling price: ");
        int sp = sc.nextInt();
        if (cp > sp) {
            System.out.println("The loss is: " + (cp - sp));
        } else if (cp < sp) {
            System.out.println("The profit is: " + (sp - cp));
        } else {
            System.out.println("No profit no loss");
        }
        sc.close();
    }
}
