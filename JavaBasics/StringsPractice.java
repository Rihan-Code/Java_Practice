public class StringsPractice {
    // strings are the immutable sequence of characters
    // strings are objects in java
    // common methods: length(), charAt(), indexOf(), substring(), trim(), toLowerCase(), toUpperCase(), replace(), split(), startsWith(), endsWith(), equals(), equalsIgnoreCase(), compareTo(), contains(), concat(), format(), intern(), valueOf()
    public static void main(String[] args) {
        String str = "Blue Planet! ";
        System.out.println("String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Index of 'e': " + str.indexOf('e'));
        System.out.println("Substring of str: " + str.substring(3, 8));
        System.out.println("Trim str: " + str.trim());
        System.out.println("To lower case: " + str.toLowerCase());
        System.out.println("To upper case: " + str.toUpperCase());
        System.out.println("Replace with: " + str.replace(str, "A division of Ciena!"));
        System.out.println("Starts with: " + str.startsWith("Blue"));
    }
}
