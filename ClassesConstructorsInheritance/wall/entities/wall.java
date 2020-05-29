package wall;

public class Wall {
    //public class Wall {

    /*
    create two fields (instance variables)

    of type Double, with the names width, and height
     */
    private double width;
    private double height;

    //setting default values for width and height @ 00.0
    public Wall() {
        this(0.0, 0.0);
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Method named getArea without any parameters, it needs to return the area of the wall.
    public double getArea() {
        double area = height * width;
        return area;
    }

    //Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth() {
        return width;
    }

    /*
    Method named setWidth with one parameter of type double, it needs to set the value of the width field.
    If the parameter is less than 0 it needs to set the width field value to 0.
     */
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        return height;
    }

    /*
    Method named setHeight with one parameter of type double, it needs to set the value of the height field.
    If the parameter is less than 0 it needs to set the height field value to 0.
     */
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
}
