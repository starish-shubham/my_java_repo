public class stringBuildercode {
    
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Shubham");
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Capacity: " + str.capacity());
        System.out.println("Character at index 0: " + str.charAt(0));
        // System.out.println(str.setCharAt(0, 's'));
        str.setCharAt(0, 't');
        System.out.println("String: " + str);
        System.out.println("Inserting u: " + str.insert(1, 'u'));
        System.out.println("Deleting u: " + str.deleteCharAt(1));
        System.out.println("Appending 'm': " + str.append('m'));
    }
}
