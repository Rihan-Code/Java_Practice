package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "John");

        // Filtering names starting with 'A' and convert to uppercase
        names.stream()
             .filter(name -> name.startsWith("A"))
             .map(String::toUpperCase)
             .forEach(System.out::println);

        // collecting data
        List<String> filteredNames = names.stream()
                                          .filter(name -> name.length() > 3)
                                          .collect(Collectors.toList());
        System.out.println(filteredNames);

        // Reducing data
        List<Integer> nums = Arrays.asList(4, 7, 55, 6, 99, 10);
        int sum = nums.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum); // 181
    }
}
