package OopPrinciples;

// Inheritance is a mechanism where one class (child/derived/subclass) inherits properties and behavior (fields and methods) from another class (parent/base/superclass)
// It allows code reuse and heirarchical classification
// Key Features:
// 1. Code resuability
// 2. Extensibility
// 3. Type of inheritance:
//    i)   Single Inheritance
//    ii)  Multilevel Inheritance
//    iii) Hierarchical Inheritance
// ***super*** keyword is used to call the constructor of the parent class in the child class using the paramaters that will help to identify which constructor has to be called, like super(arg1, arg2);

// Parent Animal class
class Animal {
public void eat() {
    System.out.println("This animal eats food.");
}
}

// Child Animal class
class Dog extends Animal {
    public void bark() {
        System.out.println("This animal is a dog taht barks.");
    }
}

// SHowing Multilevel Inheritance 
// Parent Vehicle class
class Vehicle {
    public void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car Drives.");
    }
}

class SportsCar extends Car {
    public void race() {
        System.out.println("Sports car races.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        System.out.println("Inheritance using animal class: ");
        d.eat(); // inheriting from the parent class
        d.bark();

        // multilevel inheritance 
        System.out.println("Multilevel inheritance with vehicle example: ");
        SportsCar ferari = new SportsCar();
        ferari.start();
        ferari.drive();
        ferari.race();
    }
}
