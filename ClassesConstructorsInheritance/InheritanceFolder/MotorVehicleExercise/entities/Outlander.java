package entities;

public class Outlander extends Car {
    /*
    Extending/ Inheriting from Car. So now Outlander class has all of the
    unique characteristics from Car class

    Create a new field (instance variable) roadServiceMonth
     */

    private int roadServiceMonth;

    public Outlander(int roadServiceMonth) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonth = roadServiceMonth;
    }

    /*
    Because isManuel is false, this car will have an automatic gear box.
    So therefore we will create a new method
     */
    public void accelerate(int rate) {
        /*
        rate is the difference in speed, from the current speed
        Rate can be a positive or negative.
        Positive when putting your foot on the accelerator for example, when increasing the speed
        Negative, when you're decelerating
         */
        int newVelocity = getCurrentVelocity() + rate;
        //taken into account the change in this method

        /*
        Depending on the what the new speed is going to be, change to the relevant gear
        Which is what automatic cars do.

        Changing Gear is based on the method that is defined in Car class
         */
        if (newVelocity == 0) {
            stop();
            changeGear(1); //because car is an automatic, and not manual
        } else if (newVelocity > 0 && newVelocity <= 20) {
            changeGear(1);
        } else if (newVelocity > 20 && newVelocity <= 40) {
            changeGear(2);
        } else if (newVelocity > 40 && newVelocity <= 60) {
            changeGear(3);
        } else if (newVelocity > 60 && newVelocity <= 80) {
            changeGear(4);
        } else if (newVelocity > 80 && newVelocity <= 120) {
            changeGear(5);
        } else if (newVelocity > 120 && newVelocity <= 180) {
            changeGear(6);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }
}
