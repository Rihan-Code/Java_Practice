package Java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*;

@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        // Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        // greeting.sayHello("Alice");

        // using **Predicate**
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        // using **Function<T, R>**
        Function<String, Integer> getLength = str -> str.length();
        System.out.println(getLength.apply("Blue planet"));
        System.out.println(getLength.apply("Java8"));

        // chaining function
        System.out.println("Using chaining function");
        Function<Integer, Integer> multiplyBy2 = num -> num *2;
        Function<Integer, Integer> add = num -> num + 5;
        //chaining: multiplying first and then add 5
        Function<Integer, Integer> ans = multiplyBy2.andThen(add);
        System.out.println(ans.apply(10)); // 25

        System.out.println();

        // using **Consumer<T>**
        System.out.println("Using consumer function");
        Consumer<String> prints = str -> System.out.println("Value: " + str);
        prints.accept("Blue Planet!");
        prints.accept("Java8");
        // iterating over a list
        List<Integer> list = Arrays.asList(4, 2, 77, 19, 43);
        Consumer<Integer> prinNumbers = num -> System.out.println(num);
        list.forEach(prinNumbers);;

        // Chaining consumers
        Consumer<Integer> printNumber = num -> System.out.println("Number: " + num);
        Consumer<Integer> printSquare = num -> System.out.println("Square: " + (num * num));

        Consumer<Integer> combined = printNumber.andThen(printSquare);
        combined.accept(8);

        // using **Supplier<T>**
        System.out.println();
        System.out.println("Using Supplier funciton");
        Supplier<String> getGreeting = () -> "Hello, Suppplier";
        System.out.println(getGreeting.get());

        // supplier to generate random numbers
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());

        // supplying system time
        System.out.println("supplying system time");
        Supplier<Long> currTime = System::currentTimeMillis;
        System.out.println("Current time: " + currTime.get());

    }
}
