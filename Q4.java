// Q4) Create a method area (), overload it to calculate area of circle, rectangle and square.

public class Q4 {
    // Method to calculate area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square
    public double area(double sideLength, boolean isSquare) {
        if (isSquare) {
            return sideLength * sideLength;
        } else {
            System.out.println("Invalid operation. Use the overloaded method for squares.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Q4 calculator = new Q4();

        // Calculating area of a circle
        double circleArea = calculator.area(5.0);
        System.out.println("Area of Circle: " + circleArea);

        // Calculating area of a rectangle
        double rectangleArea = calculator.area(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculating area of a square
        double squareArea = calculator.area(4.0, true);
        System.out.println("Area of Square: " + squareArea);
    }
}
