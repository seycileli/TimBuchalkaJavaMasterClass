package entities;

public class Car extends Vehicle {

    /*
    Now let's create the unique fields for our car
     */
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManuel; //whether this car is automatic or manuel
    private int currentGear; //the current gear that the car is in at this point (gear 1, gear 2 etc)

    //Car class will inherit (extend) from Vehicle
    public Car(String name, String size, int wheels, int doors, int gears, boolean isManuel) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManuel = isManuel;
        this.currentGear = 1;
    }

    /*
    create new methods;
    ability to change the gear,
    ability to change velocity
    add a method to stop
    and we also need to be able to steer as well
     */

    //create setters for current gear
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(); function (method) called" + "\n"
        + "Changed to " + this.currentGear + " gear");
    }

    //call the basic function for move from vehicle class
    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity(); method called" + "\n"
                + speed + "mph direction: " + direction);
        move(speed, direction);
    }

}
