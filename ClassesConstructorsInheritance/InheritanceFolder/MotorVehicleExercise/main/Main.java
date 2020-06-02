package main;

public class Main {

    private static Outlander outlander = new Outlander(36);
    public static void main(String[] args) {

        callingOutlander();

    }

    public static void callingOutlander() {

        outlander.steer(45); //coming all the way from Vehicle class
        outlander.accelerate(30);
        outlander.accelerate(20); //Car is maintaining current speed, plus it will add 20; current mph = 50

        //lets slow down now due to a sign saying 10 mph, let's cut the current mph by 42
        outlander.accelerate(-42); //current mph should be 8 after running method

    }
}
