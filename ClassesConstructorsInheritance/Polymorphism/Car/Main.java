package polymorphismCar;

class Car {
    //create the basic instance variables (fields) of a Car

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4; //because all cars have 4 wheels, no need to use wheels in param
        this.engine = true;
    }

    /*
    Create basic String methods, such as;
    startEngine();
    accelerate();
    brake();

    and return a message for each
     */

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    /*
    Create Getters,
    No need to create getters for Wheels or Engine since they are initialized
    in the Constructor. So it would be meaningless to create getters for those two.
     */
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
        //another way instead of having to write out the class name like you see in the below return for i.g
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake()";
    }
}

class Porsche extends Car {
    public Porsche(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Porsche -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Porsche -> accelerate()";
    }

    @Override
    public String brake() {
        return "Porsche -> brake()";
    }
}

class LandRover extends Car {
    public LandRover(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Land Rover -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Land Rover -> accelerate()";
    }

    @Override
    public String brake() {
        return "Land Rover -> brake()";
    }
}

public class Main {

    private static Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRW 4WD");
    private static Porsche porsche911 = new Porsche(6, "Porsche 911");
    private static LandRover landRoverDefender = new LandRover(4, "Land Rover Defender");
    public static void main(String[] args) {

        mitsubishi();
        porsche();
        landRoverDefender();

    }

    public static void mitsubishi() {
        System.out.println("\n" + mitsubishi.startEngine() + "\n"
        + mitsubishi.accelerate() + "\n" + mitsubishi.brake());
    }

    public static void porsche() {
        System.out.println("\n" + porsche911.startEngine() + "\n"
                + porsche911.accelerate() + "\n" + porsche911.brake());
    }

    public static void landRoverDefender() {
        System.out.println("\n" + landRoverDefender.startEngine() + "\n"
                + landRoverDefender.accelerate() + "\n" + landRoverDefender.brake());
    }
}
