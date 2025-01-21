public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        //Relational Operators
        System.out.println("a is equal to b: " + (a == b));
        System.out.println("a is not equal to b: " + (a != b));
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is less than b: " + (a < b));
        System.out.println("a is greater than or equal to b: " + (a >= b));
        System.out.println("a is less than or equal to b: " + (a <= b));

        //Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));
        System.out.println("NOT y: " + (!y));

        //Bitwise Operators
        int c = 60; // 60 = 0011 1100
        int d = 13; // 13 = 0000 1101
        System.out.println("c & d: " + (c & d)); // 12 = 0000 1100
        System.out.println("c | d: " + (c | d)); // 61 = 0011 1101
        System.out.println("c ^ d: " + (c ^ d)); // 49 = 0011 0001
        System.out.println("~c: " + (~c)); // -61 = 1100 0011
        System.out.println("c << 2: " + (c << 2)); // 240 = 1111 0000
        System.out.println("c >> 2: " + (c >> 2)); // 15 = 0000 1111
        System.out.println("c >>> 2: " + (c >>> 2)); // 15 = 0000 1111

        //Assignment Operators
        int e = 10;
        e += 5; // e = e + 5
        System.out.println("e += 5: " + e);

        //Unary Operators
        int f = 10;
        System.out.println("f++: " + f++); // 10
        System.out.println("++f: " + ++f); // 12
        System.out.println("f--: " + f--); // 12
        System.out.println("--f: " + --f); // 10

        //Ternary Operator
        int g = 10;
        int h = 20;
        int result = (g > h) ? g : h; // if g is greater than h, result = g, else result = h
        System.out.println("Result: " + result);
    }
}
