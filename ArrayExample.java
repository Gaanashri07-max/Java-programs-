public class ArrayExample {
    public static void main(String[] args) {

        // Declare an array
        int[] arr;

        // Allocate memory for 5 integers
        arr = new int[5];

        // Initialize the elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Access the elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
    }
}