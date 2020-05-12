public class AreaCalculator {

    public static void main(String[] args) {

        area(5.0); //should return 78.53975
        area(-1); //should return -1 since the parameter is negative
        area(5.0, 4.0); //should return 20.0 (5.0 * 4.0 = 20) ~ because 5 multiplied by 4 = 20
        area(-1.0, 4.0); //should return -1 since the parameter is negative

    }

    /**
     * Write a method named AREA
     * With ONE PARAMETER named RADIUS
     *
     * The method needs to RETURN a DOUBLE value that represents the AREA of a circle
     *
     * TIP:
     * The formula for calculating a circle is;
     *
     * radius * radius * Math.PI
     *
     * NOTE: for PI, use a constant from Math class eg: Math.PI
     *
     * NOTE: All methods need to be defined as public static
     * NOTE: Do not add a main method to your solution code
     * @param radius
     * @return -1.0 to indicate an invalid value
     */
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid value");
            return -1.0;
        }

        return Math.PI * (radius * radius);
    }

    /**
     * Write ANOTHER overloaded method with 2 parameters x && y (both double)
     * Where x and y represents the sides of a rectangle
     *
     * The method needs to return an area of a rectangle
     *
     * TIP:
     * The formula for calculating a RECTANGLE is x * y
     *
     * @param x
     * @param y
     * @return -1.0 to indicate an invalid value
     */
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("Invalid value");
            return -1.0;
        }

        return x * y;
    }

}
