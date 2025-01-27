package Java8;

import java.util.*;

public class Lambdas {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8");
            }
        };
        r1.run();

        // Lambda expression
        Runnable r2 = () -> System.out.println("Java8");
        r2.run();

        System.out.println();

        System.out.println("Lambda expression as argument");
        // passing lambda expression as argument
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        names.forEach(name -> System.out.println(name));

        System.out.println();

        // Lambda with comparator
        System.out.println("Lambda with comparator");
        Collections.sort(names, (a, b) -> b.compareTo(a)); // sort in reverse order
        System.out.println(names);

    }
}
