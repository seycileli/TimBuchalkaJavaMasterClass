package main;

public class Main {

    public static void main(String[] args) {

        testRectangle();
        testCuboid();

    }

    private static void testRectangle() {
        System.out.println("\n" + "Beginning test for Rectangle class:");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Rectangle.width() = " + rectangle.getWidth());
        System.out.println("Rectangle.length() = " + rectangle.getLength());
        System.out.println("Rectangle.area() = " + rectangle.getArea());
        System.out.println("Ending test for Rectangle class." + "\n");
    }

    private static void testCuboid() {
        System.out.println("Beginning test for Cuboid class:");
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Cuboid.width() = " + cuboid.getWidth());
        System.out.println("Cuboid.length() = " + cuboid.getLength());
        System.out.println("Cuboid.area() = " + cuboid.getArea());
        System.out.println("Cuboid.height() = " + cuboid.getHeight());
        System.out.println("Cuboid.volume() = " + cuboid.getVolume());
        System.out.println("Ending test for Cuboid class.");
    }

}
