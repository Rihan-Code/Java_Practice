package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UsingHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Task1");
        set.add("Task2");
        set.add("Waiting...");
        set.add("Waiting...");
        set.add("Task2");
        set.add("Task3");
        set.add("Task4");
        set.add("Task1");

        for(String s : set) {
            System.out.println(s);
        }
        System.out.println("\nContains 'Task1': " + set.contains("Task1"));

        // LinkedHashSet
        // maintains insertion order
        System.out.println("\nLinkedHasSet example which maintains the insertion order :");
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        orderedSet.add("Task1");
        orderedSet.add("Task3");
        orderedSet.add("Waiting...");
        orderedSet.add("Task4");
        orderedSet.add("Task3");
        orderedSet.add("Task5");

        for(String s : orderedSet) {
            System.out.println(s);
        }
    }
}
