package entities;

public class Dog extends Animal {
    //create instance variables of eyes, legs, tail, teeth of type int, and coat of type String

    private static int eyes;
    private static int legs;
    private static int tail;
    private static int teeth;
    private static String coat;

    //call super constructor from class Animal
    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
        super(name, 1, 1, size, weight);
        //will change brain and body to 1, because all dogs share this same characteristic

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    /*
    Create method named chew();

    Create an @Override method named eat();
                    call method named chew();
                    call super.eat(); method from Animal class within code block

    Create a method named walk();
                    set speed to 5, using super class from Animal, method move();

    Create a method named run();
                    set speed to 10, using super class from Animal, method move();

    Create a method named moveLegs with parameter of type int, named speed

    Create an @Override method named named move(); with parameter type int, named speed
                        call method moveLegs(speed)
                        call super.move(speed)
     */

    public void chew() {
        System.out.println("Dog.chew(); method being called ");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat(); method being called ");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk(); method being called ");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run(); method being called ");
        super.move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs(); method being called ");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move(); method being called ");
        moveLegs(speed);
        super.move(speed);
    }

}
