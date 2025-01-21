import java.util.*;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] num = {2, 10, 20, 30 , 40, 50, 42, 15, 87, 30};
        
        //traversal
        System.out.println("Num array elements: ");
        for(int i=0; i<num.length; i++) {
            System.out.println("Index " + i + ": " + num[i]);;
        }

        //enhanced for loop
        System.out.println("Enhanced loop traversal");
        for(int n : num) {
            System.out.println(n);
        }

        //******2D Arrays******//
        int[][] matrix = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {3, 2, 6, 12},
            {10, 3, 5, 33}
        };
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //find maximum and minimum from the num array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int n : num) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        System.out.println("Maximum element in num: " + max);
        System.out.println("Minimum element in num: " + min);


        //Sort the num array using Arrays.sort()
        Arrays.sort(num);
        System.out.println("Sorted num array is: " + Arrays.toString(num));

        //searching: Linear search
        int target = 15;
        boolean isPresent = false;

        for(int i=0; i<num.length; i++) {
            if(num[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                isPresent = true;
                break;
            }
            if(!isPresent) System.out.println("Element " + target + " not found in num array");
        }

        //searching: Binary search
        int index = Arrays.binarySearch(num, target); // returns index of the element if present
        if(index >= 0) System.out.println("Element " + target + " found at index " + index);
        else System.out.println("Element " + target + " not found in num array");

        //copying array
        int[] copy = Arrays.copyOf(num, num.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        //reversing array
        for(int i=0; i<num.length/2; i++) {
            int temp = num[i];
            num[i] = num[num.length - i - 1];
            num[num.length - i - 1] = temp;
        }
        System.out.println("Reversed num array: " + Arrays.toString(num));

        //removing duplicates
        System.out.println("Num array with duplicates: " + Arrays.toString(num));
        int[] unique = Arrays.stream(num).distinct().toArray();
        System.out.println("Num array without duplicates: " + Arrays.toString(unique));

        //filling array
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("Filled array: " + Arrays.toString(filled));
    }
}
 