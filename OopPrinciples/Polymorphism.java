package OopPrinciples;

// Polymorphism means "many forms". 
// It allows objects to take multiple forms, enabling same method or operator to behave differently depending on the context
// Type of Polymorphism:
// 1. Compile-Time Polymorphism (Method Overloading): Same method name with different parameters
// 2. Run-Time Polymorphism (Method Overriding): Subclass provided a specific implementation of a method defined in the parent class

// COMPILE_TIME Polymorphism example
class Calculator {
    // func for adding 2 numbers
    public int add(int a, int b) {
        return a + b;
    }

    // func for adding 3 number
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// RUN_TIME Polymorphism example
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile-Time Polymorphism
        System.out.println("Compile time polymorphism demonstration: ");
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers are: " + calc.add(35, 97));
        System.out.println("Sum of 3 numbers are: " + calc.add(88, 74, 98));

        System.out.println();

        // Run Time Polymorphism
        System.out.println("Run time polymorphism demonstration: ");
        Shape shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }    
}
