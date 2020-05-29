package entities;

public class Point {

    /*
    You have to represent a Point in 2D space.

    The class needs two fields (instance variables) with name x and y, of type int
     */

    private int x, y;

    /*
    The class needs to have two constructors.

    The first constructor does not have any parameters (no-arg constructor)
    The second constructor has parameters x and y of type int and it needs to initialize the fields.

    Write the following fields;

    Create Getters & Setters
    Empty Constructor & Constructor that has 2 parameters x and y of type int
    */

    /*
    Method named distance without any parameters,
    It needs to return the distance between this Point and Point 0, 0 as double.
     */
    public double distance() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    /*
    Method named distance with 2 parameters, x, y both of type int.
    It needs to return the distance between this Point and Point x, y as double
     */
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) *
                (this.x - x) +
                (this.y - y) *
                (this.y - y));
    }

    /*
    Method named distance with parameter another of type Point,
    it needs to return the distance between this Point and another Point as double
     */
    public double distance(Point point) {
        return Math.sqrt(
                (point.getX() - x) *
                (point.getX() - x) +
                (point.getY() - y) *
                (point.getY() - y));
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
