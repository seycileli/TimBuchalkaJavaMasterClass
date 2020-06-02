package entities;

public class Vehicle {

    private String name;
    private String size;
    /*
    Create 2 more fields;

    One for currentVelocity, another currentDirection and currentSpeed
    We want velocity to figure out how fast the car is going
    and direction to which direction the car is going in
    */
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    /*
    We will not create a field called Gears here, because not all vehicles have Gears.
    But, we will create a field (instance variable) called move, because all vehicles do move
    And if they move, they are pointed into a certain direction, so that is something we need to handle
     */

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(); method called:" + "\n" +
                "Steering at " + currentDirection + " degrees");
    }

    /*
    Create another method that handles velocity and direction
     */
    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(); Moving at " + currentVelocity +
                "mph in direction " + currentDirection);
    }

    //create a stop method, because all vehicles do have this function/ ability/ mechanism to stop
    public void stop() {
        this.currentVelocity = 0;
    }

    //create getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
