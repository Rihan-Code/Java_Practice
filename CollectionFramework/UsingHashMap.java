package CollectionFramework;

import java.util.HashMap;

public class UsingHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Task1");
        map.put(2, "Task2");
        map.put(3, "Waiting...");
        map.put(4, "Task3");
        map.put(5, "Task4");
        System.out.println("Task at key 4: " + map.get(2));

        // iterating thor;ugh keys and values
        for(Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Removing an entry from map
        map.remove(2);
        System.out.println("\nAfter Removal: " + map);
    }
}
