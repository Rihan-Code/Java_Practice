package java17;

public class PatterMatchingExample {
    public static void main(String[] args) {
        Integer num = 87489;

        String result = switch (num % 2) {
            case 0 -> "even";
            case 1 -> "odd";
            default -> "Unknown!";
        };

        System.out.println(result);
    }
}