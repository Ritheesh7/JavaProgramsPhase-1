package practiceproject;
import java.util.Scanner;

//GeometricShape interface with a method for calculating area
interface GeometricShape {
double calculateArea();
}

//Circle class implementing GeometricShape
class Circle implements GeometricShape {
private double radius;

public Circle(double radius) {
   this.radius = radius;
}

@Override
public double calculateArea() {
   return Math.PI * radius * radius;
}
}

//Rectangle class implementing GeometricShape
class Rectangle implements GeometricShape {
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
}

//Triangle class implementing GeometricShape
class Triangle implements GeometricShape {
private double base;
private double height;

public Triangle(double base, double height) {
   this.base = base;
   this.height = height;
}

@Override
public double calculateArea() {
   return 0.5 * base * height;
}
}

public class PracticeProject {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   // Calculate area for a Circle
   System.out.print("Enter the radius of the circle: ");
   double circleRadius = scanner.nextDouble();
   Circle circle = new Circle(circleRadius);
   System.out.println("Area of the Circle: " + circle.calculateArea());

   // Calculate area for a Rectangle
   System.out.print("Enter the length of the rectangle: ");
   double rectangleLength = scanner.nextDouble();
   System.out.print("Enter the width of the rectangle: ");
   double rectangleWidth = scanner.nextDouble();
   Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
   System.out.println("Area of the Rectangle: " + rectangle.calculateArea());

   // Calculate area for a Triangle
   System.out.print("Enter the base of the triangle: ");
   double triangleBase = scanner.nextDouble();
   System.out.print("Enter the height of the triangle: ");
   double triangleHeight = scanner.nextDouble();
   Triangle triangle = new Triangle(triangleBase, triangleHeight);
   System.out.println("Area of the Triangle: " + triangle.calculateArea());

   scanner.close();
}
}
