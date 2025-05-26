import java.util.Scanner;

public class minor_project {
    public static void main(String[] args) {
        System.out.println("::WELCOME TO NUMBER GUESSING GAME::");
        int randomno = (int)(Math.random()*100);
        // System.out.println(randomno);
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("<--guess the number-->");
            a = sc.nextInt();
            if (a<randomno) {
                System.out.println("your number is less than the orignal no");
            }
            else if (a == randomno) {
                System.out.println("WHOOHOO YOU GOT IT RIGHT");
                break;
            }
            else {
                System.out.println("your number is greater than the orignal no");
            }
        } while (a >= 0);
    }
}
