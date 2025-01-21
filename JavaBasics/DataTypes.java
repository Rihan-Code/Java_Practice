public class DataTypes {
    public static void main(String[] args) {
        //Java has 2 categories of data types:
        //1. Primitive
        byte b = 100; // 8-bit integer -128 to 127
        short s = 10000; // 16-bit integer -32768 to 32767
        int i = 100000; // 32-bit integer -214783648 to 214783647
        long l = 10000000000L; // 64-bit integer -9223372036854775808 to 9223372036854775807
        float f = 10.5f; // 32-bit decimal 3.4e-038 to 3.4e+038
        double d = 123.456; // 64-bit decimal 1.7e-308 to 1.7e+308
        char c = 'A'; // 16-bit uniode character
        boolean isTrue = true; // true or false

        //printing values 
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + isTrue);


    }
}