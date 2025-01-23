package CollectionFramework;

import java.util.TreeMap;

public class UsingTreeMap {
    public static void main(String[] args) {
        // TreeMap is used to store key-value pairs in sorted order of keys
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Task1", 1);
        map.put("Task9", 9);
        map.put("Task3", 3);
        map.put("Task95", 95);
        map.put("Task4", 4);
        // System.out.println(map.hashCode());
        System.out.println("Sorted map: " + map);
    } 
}
