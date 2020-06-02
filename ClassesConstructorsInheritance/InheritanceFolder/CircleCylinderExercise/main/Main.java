package main;

public class Main {

    public static void main(String[] args) {

        testCircle();
        testCylinder();

    }

    public static void testCircle() {
        System.out.println("\n" + "Testing Circle class");
        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius = " + circle.getRadius());
        System.out.println("Circle.area = " + circle.getArea());
        System.out.println("Ending test for Circle class");
    }

    public static void testCylinder() {
        System.out.println("\n" + "Testing Cylinder class");
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder.radius = " + cylinder.getRadius());
        System.out.println("Cylinder.height = " + cylinder.getHeight());
        System.out.println("Cylinder.area = " + cylinder.getArea());
        System.out.println("Cylinder.volume = " + cylinder.getVolume());
        System.out.println("End testing for Cylinder class");

    }
}
