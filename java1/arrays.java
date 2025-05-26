public class arrays {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 10;
        }
        
        System.out.println("Element at index 0: " + myArray[0]);
        System.out.println("Element at index 1: " + myArray[1]);
        System.out.println("Element at index 2: " + myArray[2]);
    }
}
