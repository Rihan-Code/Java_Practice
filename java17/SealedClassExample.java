package java17;

sealed class Shape permits Circle, Rectangle, Square {

}
final class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
}
final class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

// since Square is non-sealed therefore it can be further extended, but in above classes NO further inheritance allowed
non-sealed class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
}

public class SealedClassExample {
    
}
