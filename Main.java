//Write a Java program to shift
// its elements to the right by a specified number of positions randomly.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random random = new Random();
        Scanner sc= new Scanner (System.in  );
        int numShifts = sc.nextInt ();

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Number of shifts: " + numShifts);
        for (int i = 0; i < numShifts; i++) {
            int lastElement = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = lastElement;
        }

        System.out.println("Shifted array 1" + Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < numShifts; i++) {
            int temp = arr[left];
            for (int j = left + 1; j <= right; j++) {
                arr[j - 1] = arr[j];
            }
            arr[right] = temp;
        }

        System.out.println("Shifted array 2 " + Arrays.toString(arr));

    }
}