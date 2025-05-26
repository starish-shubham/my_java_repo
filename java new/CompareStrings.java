import java.util.*;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input 2 strings
        // System.out.println("Program to compare 2 strings");
        // System.out.print("Enter String 1: ");
        // String myString1 = sc.nextLine();
        // System.out.print("Enter String 2: ");
        // String myString2 = sc.nextLine();

        //compring 2 strings
        // int k = 0;
        // for (int i = 0; i < myString1.length(); i++) {
        //     if (myString1.length() == myString1.length()) {
        //         if (myString1.charAt(i) == myString2.charAt(i)) {
        //             k = 0;
        //         }
        //         else{
        //         k = 1;
        //         } 
        //     }
        // } 
        // if (k == 0) {
        //     System.out.println("Both Strings are equal");   
        // }
        // else{
        //     System.out.println("Both Strings are not equal");
        // }

        // String e = "e";
        // String r = "e";
        // if ( e == r) {
        //     System.out.println("haa hai");
        // } else {
        //     System.out.println("nhi hai");
        // }

        // --------------------Shortcut Method--------------
        // if (myString1.compareTo(myString2) == 0) {
        //     System.out.println("Both Strings are equal");
        // }
        // else{
        //     System.out.println("Both Strings are not equal");
        // }

        // ===================Stirng Builders================
        StringBuilder sb = new StringBuilder("Shubham gupta");
        System.out.println(sb);
        // System.out.println(setCharAt(sb, (9,sb.length())));
        sb.setCharAt(8, 'G');
        System.out.println(sb);
    }
}
