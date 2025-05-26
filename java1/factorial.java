import java.util.Scanner;

public class factorial {
    public static int Fact(int num){
        if (num == 0 || num == 1)
            return 1;
        else
            return num * Fact(num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int number = sc.nextInt();
        System.out.println("Factorial of " + number + " is " + Fact(number));
    }
}
