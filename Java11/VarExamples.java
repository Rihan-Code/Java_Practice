package Java11;
import java.util.*;;
public class VarExamples {
    public static void main(String[] args) {
        var bp = "Blue Planet!";
        System.out.println(bp);

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        for(var name : names) {
            System.out.println(name);
        }

        // using in lambda funcitons
        List<Integer> numbers = List.of(77, 55, 33, 45);
        numbers.forEach((var num) -> {
            System.out.println("Number: " + num);
        });


    }
}
