package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Cherry");
        System.out.println("All the fruits in the fruits are: " + fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.remove("Cherry");
        System.out.println("\nAppended fruits: " + fruits);

        fruits.add(3, "Kivi");
        System.out.println("\nSize of the fruits list is: " + fruits.size());

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(86);
        nums.add(75);
        nums.add(18);
        nums.add(15);
        nums.add(55);
        System.out.println("Nums list: " + nums);

        // Sort
        Collections.sort(nums);
        System.out.println("\nSorted numbers are: " + nums);

        // Search
        int index = Collections.binarySearch(nums, 18);
        System.out.println("Index of 15 is: " + index);
    }
}
