package entities;

public class Animal {

    //create an instance variable of name of type String and brain, body, size and weight of type int

    private static String name;
    private static int brain;
    private static int body;
    private static int size;
    private static int weight;

    //create a constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    /*
    Create 2 methods
    First method with the name eat
    Second method with the name move with the parameter speed of type int
     */
    public void eat() {
        System.out.println("Animal.eat() method is called ");
    }

    public void move(int speed) {
        System.out.println("Animal.speed() method is called " + speed);
    }

    //create getters
    public static String getName() {
        return name;
    }

    public static int getBrain() {
        return brain;
    }

    public static int getBody() {
        return body;
    }

    public static int getSize() {
        return size;
    }

    public static int getWeight() {
        return weight;
    }

}
