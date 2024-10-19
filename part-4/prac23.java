import java.lang.Math; 
import java.lang.String;

interface Shape {
    String getColor();  
    double getArea();   

    
    default String describe() {
        return "This is a shape with color: " + getColor() + " and area: " + getArea();
    }
}

// Implement the Circle class
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String describe() {
        return "Circle with radius: " + radius + ", color: " + color + ", area: " + getArea();
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String describe() {
        return "Rectangle with length: " + length + ", width: " + width + ", color: " + color + ", area: " + getArea();
    }
}

// Define the Sign class
class Sign {
    private Shape shape;  
    private String text;  

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public String displaySign() {
        return shape.describe() + "\nSign text: " + text;
    }
}

// Main class to test the functionality
public class prac23 {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle(5.0, "Red");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");

        // Create signs with shapes and text
        Sign circleSign = new Sign(circle, "Welcome to the Park");
        Sign rectangleSign = new Sign(rectangle, "Event Today!");

        // Display the signs
        System.out.println(circleSign.displaySign());
        System.out.println();
        System.out.println(rectangleSign.displaySign());
    }
}
