package entities;

public class Floor {

    /*
    The Carpet Company has asked you to write a calculator to write an application
    that calculates the price of carpeting for rectangular rooms.

    To calculate the price, you multiply the area of the floor (width * length)
    by the price per square meter of carpet.

    For example; the area of the floor tha is 12 meters long and 10 meters wide is 120 square meters.

    To cover the floor that costs $8 dollars per square meter would cost $960

    1. Write a class with the name Floor.

    The class needs two fields (instance variables) with name width and length of type double
     */

    private double width, length;

    /*
    This class needs to have one constructor with parameters of width and length of type double,
    and it needs to initialize the fields.

    In case the width parameter is less than 0, it needs to set the width field value to 0
    in case the length parameter is less than 0, it needs to the set the length field value to 0
     */
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;

        if (width < 0) {
            this.width = 0;
        }

        if (length < 0) {
            this.length = 0;
        }
    }

    /*
    Write the following methods (instance methods)

    Method named getArea without any parameters, it needs to return the calculated area (width * length)
     */
    public double getArea() {
        return width * length;
    }
}
