/**
 * This is completely unrelated to the courses content.
 * I am testing out this code and trying to learn something about threading.
 */

import java.util.Random;

class InnerClassDemoI implements Runnable {
    int sleepDuration;
    Random random = new Random();
    int counter = 1;

    public InnerClassDemoI() {
        this.sleepDuration = random.nextInt(1000);
    }

    @Override
    public void run() {

        try {
            System.out.println(
                    "Attempt #" + counter++
                    + ": \nwhen will you wake? \n"
                    + sleepDuration + " is passing \n" +
                    "hey I'm waiting on you...");
            Thread.sleep(sleepDuration);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
            return;
        }
        System.out.println("I'm born! \n");
    }
}

public class Main {

    public static void main(String[] args) {
        (new InnerClassDemoI()).run();

        InnerClassDemoI innerClassDemoIOne = new InnerClassDemoI();
        InnerClassDemoI innerClassDemoITwo = new InnerClassDemoI();

        innerClassDemoIOne.run();
        innerClassDemoITwo.run();

    }
}
