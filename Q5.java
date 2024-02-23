// Q5) WAJP to create an interface area. Create three classes called rectangle, triangle, and square calculate areas respectively.

// Interface for calculating area
interface Area {
    double calculateArea();
}

// Class representing a rectangle
class Rectangle implements Area {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea method for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Class representing a triangle
class Triangle implements Area {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of calculateArea method for Triangle
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// Class representing a square
class Square implements Area {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of calculateArea method for Square
    @Override
    public double calculateArea() {
        return side * side;
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Creating instances of Rectangle, Triangle, and Square
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(6, 8);
        Square square = new Square(4);

        // Calculating and displaying areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
    }
}
