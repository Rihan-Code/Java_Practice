package OopPrinciples;

// Abstraction focuses on hiding implementation details and showing only the essential features of an object.
// It is achieved using abstract classes and interface
// Key Features:
// 1. Abstract classes: Can have abstract (unimplemented) and non-abstract (implemented) methods. 
//      It cannot be instatiated
// 2. Interface: All methods are abstract by default befor JAVA 8
//      Starting JAVA 8, interfaces can have default and static methods

abstract class Vehicle {
    // Abstract method (no implementation)
    public abstract void start();

    // Non-abstract method
    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

// Interface example
interface Animal {
    void eat();
    void sound();
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }

    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Abstract class example
        System.out.println("Abstract class example:");
        Vehicle car = new Car();
        car.start();
        car.stop();

        // Interface example
        System.out.println("\nInterface example:");
        Animal cat = new Cat();
        cat.eat();
        cat.sound();
    }
}