package motorVehicle;

/*
    If I want to use the lombok plugin, instead of writing all Getters/ Setters etc
    I'd have to add the Lombok dependency to the pom.xml file
    Which means this would have need to be a Maven project initially

    The annotations will be as follows:
    @Getter
    @Setter
    @NoArgsConstructor
    @EqualsAndHashCode
    @ToString
 */
public class Car {
    /*
    These variables are the STATE component for a Car.
    (In other words; These are characteristics of a Car)
     */
    private int doors; //Field defined
    private int wheels; // int wheels; -> an Expression
    private String model; //private String model; -> a Statement
    private String engine;
    private String color;
    /*
    Template of the variables that would be part of a Class
    Above variables are the STATE of the car, for example
    Which we're defining as FIELDS

    What is a class? It is a blueprint, from which individual Objects are created.
    We will create an Object next.
     */

    public Car(int doors, int wheels, String model, String engine, String color) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
