package LoopExamples;

public class InterestRateCalculator {

    public static void main(String[] args) {

        calculateInterestRate();
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }

    public static void calculateInterestRate() {
        /**
         * using the FOR statement, call the calculateInterest method with
         * the amount of 10,000 with an interest rate of 2, 3, 4, ... 8
         * and print out the statement
         */

        System.out.println("\n" + "incrementing");
        //incremented
        for (int i = 2; i < 9; i++) {
            System.out.println("$10,000 and " + i + "% interest rate = "
                    + calculateInterest(10000, i));
        }

        /**
         * modify the above loop to the same thing as shown, but this time starting from
         * interest rate of 8% and work your way back down to 2%
         */

        System.out.println("\n" + "decrementing");
        //decremented
        for (int i = 8; i >= 2; i--) {
            System.out.println("$10,000 and " + i + "% interest rate = "
                    + String.format("%.2f", calculateInterest(10000, i)));
            //using String format to output the number with just 2 decimal points
        }
    }
}
