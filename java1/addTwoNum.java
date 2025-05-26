import java.util.Scanner;

public class addTwoNum {
    public static int Sum(int num1, int num2) {
        int sum = num1 * num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int prod = Sum(num1, num2);
        System.out.println(prod);
        // System.out.println(Sum(num1, num2));
    }
}
