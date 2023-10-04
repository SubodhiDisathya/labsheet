package Shapes;
// Step 1: Create a new Java project named "AbstractionLab."
// - Project name: AbstractionLab

// Step 2: Inside the project, create a Java package called "shapes."
package shapes;

// Step 3: Within the "shapes" package, create an abstract class called "Shape."
public abstract class Shape {
    // Define two abstract methods inside the "Shape" class:
    // ✓ calculateArea() with a return type of double
    public abstract double calculateArea();

    // ✓ calculatePerimeter() with a return type of double
    public abstract double calculatePerimeter();
}

// Step 4: Implementing Concrete Subclasses
// • Create two concrete subclasses of the "Shape" class:

// Circle class: Implement this class with instance variables for the radius and constructors.
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class: Implement this class with instance variables for the length and width and constructors.
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 5: Testing the Classes
// • Create a "Main" class outside of the "shapes" package.
public class Main {
    public static void main(String[] args) {
        // In the "Main" class's main method, create instances of the Circle and Rectangle classes.
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculate and print the area and perimeter for each shape.
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
