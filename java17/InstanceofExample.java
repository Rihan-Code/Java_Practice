package java17;

public class InstanceofExample {
    public static void main(String[] args) {
        Object obj = "Hello, java!";
        if(obj instanceof String str) {
            System.out.println("String Value: " + str.toUpperCase());
        } else {
            System.out.println("Not a string.");
        }

        Object t = 54356;
        if(t instanceof Integer num && num > 100) {
            System.out.println("Large integer: " + num);
        } else {
            System.out.println("Not a large integer.");
        }
    }
}
 