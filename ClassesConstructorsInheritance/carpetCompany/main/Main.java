package main;

public class Main {

    private static Carpet carpet = new Carpet(3.5);
    private static Floor floor = new Floor(2.75, 4.0);
    private static Calculator calculator = new Calculator(floor, carpet);
    public static void main(String[] args) {

        /*
        TEST EXAMPLE
        
        → TEST CODE:

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        → OUTPUT

        total= 38.5
        total= 36.45
         */

        System.out.println("Total = " + calculator.getTotalCost()); //output: 38.5

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println("Total = " + calculator.getTotalCost()); //output: 36.45

    }
}
