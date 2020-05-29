package point;

public class Main {

    private static Point point;
    private static Point first;
    private static Point second;

    public static void main(String[] args) {
        /*
        TEST EXAMPLE

        → TEST CODE:

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

        OUTPUT
        distance(0,0)= 7.810249675906654
        distance(second)= 5.0
        distance(2,2)= 5.0
        distance()= 0.0
         */

        first = new Point(6, 5);
        second = new Point(3, 1);

        System.out.println("Distance(0, 0) = " + first.distance());
        System.out.println("Distance(0, 0) = " + first.distance(second));
        System.out.println("Distance(2, 2) = " + first.distance(2, 2));

        point = new Point();
        System.out.println("Distance() = " + point.distance());
    }
}
