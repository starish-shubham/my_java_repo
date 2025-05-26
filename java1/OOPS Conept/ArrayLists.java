
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    // ArrayList<Boolean> list3 = new ArrayList<Boolean>();
    // ArrayList<Float> list4 = new ArrayList<Float>();

    list2.add(1);
    list2.add(2);
    list2.add(4);
    list2.add(3);
    list2.add(1,4);
    list2.set(1,5);
    // list2.remove(1);
    
    // System.out.println(list2.get(0));
    System.out.println("List is: " + list2 + " || Size is: " + list2.size());
    Collections.sort(list2);
    System.out.println("List is: " + list2 + " || Size is: " + list2.size());
    }
}
