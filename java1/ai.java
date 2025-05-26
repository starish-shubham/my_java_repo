import java.util.Arrays;
import java.util.Scanner;

public class ai {
    public static void main(String[] args) {
        // System.out.println("Hello Java");
        // System.out.println("hii");
        // String a = "Shubham";
        // String b = "Gupta";
        // int age = 22;
        // System.out.println(a + " " +b + age);
        // int math = 100;
        // int chem  = 1000;
        // int phy  = 150;
        // System.out.println(math+" "+chem+" "+phy);
        int [] marks = new int[3];
        marks[0] = 10000;
        marks[1] = 1000;
        marks[2] = 150;
        // for (int i : marks) {
        //     System.out.println(i);
        // }
        // System.out.println(marks[0]+ " "+ marks[1] + " " + marks[2]);
        // System.out.println(marks.length);
        // Arrays.sort(marks);
        // System.out.println(marks[0]);

        Scanner sh = new Scanner(System.in);
        // System.out.println("Enter ur age:");
        // int age = sh.nextInt();
        // System.out.println(age);
        

        // for (int i = 0; i < marks.length; i++) {
        //     for (int j = 0; j < marks.length; j++) {
        //         System.out.println(i);
        //     }   
        // }
        // int m = 0;
        // while (m<3) {
        //     System.out.println(m);
        //     m++;
        // }
        // do {
        //     System.out.println(m);
        //     m++;
        // } while (m<3);
        
        for (int i = 0; i < 2; i++) {

            System.out.println("Enter 5 to exit::");
            int inp = sh.nextInt(); 
            System.out.println("You have entered:");
            System.out.println(inp);
            if (inp == 5) {
                i = 3;
                System.out.println("THE END");
            } else {
               
                i = 0;
            }
        }

    }
    
}