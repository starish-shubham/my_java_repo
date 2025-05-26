
import java.util.Scanner;

public class areaPerimeter {
    public static int area(int l, int b) {
        return l * b;
    }
    public static int perimeter(int l, int b) {
        return 2 * (l + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        int areaOfRectangle = area(l, b);
        int perimeterOfRectangle = perimeter(l, b);
        System.out.println("Area: " + areaOfRectangle + " || Perimeter : " + perimeterOfRectangle);
        if (areaOfRectangle < perimeterOfRectangle) {
            System.out.println("Area is less than perimeter");
        } else if (areaOfRectangle > perimeterOfRectangle) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Area is equal to perimeter");
            
        }
        sc.close();
    }
}
