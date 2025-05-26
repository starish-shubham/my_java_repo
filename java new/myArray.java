import java.util.*;

public class myArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int noOfElements = sc.nextInt();
        int marks[] = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            marks[i] = sc.nextInt();
        }
        // System.out.println(marks[0]);
        for (int i = 0; i < noOfElements; i++) {
            System.out.println("marks of subject " + (i+1) + ":" + marks[i]);
        }
    }
}