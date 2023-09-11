package interfacedemo;

//Interface
interface Shape {
 double getArea();
}

//Rectangle class
class Rectangle implements Shape {
	double width;
	double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double getArea() {
     return width * height;
 }
}

//Circle class
class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}

//Triangle class
class Triangle implements Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height;
 }
}

//Main class to test the implementations
public class InterfaceDemo {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle(3, 7);
     Circle circle = new Circle(5);
     Triangle triangle = new Triangle(6, 3);

     System.out.println("Rectangle Area: " + rectangle.getArea());
     System.out.println("Circle Area: " + circle.getArea());
     System.out.println("Triangle Area: " + triangle.getArea());
 }
}

