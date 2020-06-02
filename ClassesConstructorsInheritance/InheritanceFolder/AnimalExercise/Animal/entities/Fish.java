package entities;

public class Fish extends Animal {

    /*
    Create an instance variable of gills, eyes and fins of type int
     */

    private static int gills;
    private static int eyes;
    private static int fins;

    //creating constructor matching super Animal
    public Fish(String name, int brain, int body, int size, int weight) {
        super(name, 1, 1, size, weight);
        //changing brain and body to 1, because all fish same this characteristic
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    /*
    Create method rest, because fish do not sleep; rather they rest

    Because fish don't have arms and legs like we do and that they use their muscles inorder
    to get around. Create a method named moveMuscleS()

    Fish also swim using their back fins, therefore create a method named backFins();

    Because fish swim, create a method named swim();
        within parameters, create data type of int named speed
                    within the code block of method swim();
                    call moveMuscles() method
                    call backFins() method
                    call super method from Animal class move
     */

    public void rest() {
        System.out.println("Fish.rest(); method being called ");
    }

    public void moveMuscles() {
        System.out.println("Fish.moveMuscles(); method being called ");
    }

    public void backFins() {
        System.out.println("Fish.backFins(); method being called");
    }

    public void swim(int speed) {
        moveMuscles();
        backFins();
        super.move(speed);
    }

}
