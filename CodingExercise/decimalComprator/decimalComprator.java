import java.util.Scanner;

public class DecimalComparator {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        areEqualByThreeDecimalPlaces(3.175, 3.176); //false
        areEqualByThreeDecimalPlacesTwo(3.0, 3.0); //true
        areEqualByThreeDecimalPlaces(3.1756, 3.175); //true
        areEqualByThreeDecimalPlacesTwo(-3.123, 3.123); //false
        equalByThreeDecimalsWithScanner();

    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        if ((int) (a * 1000) == (int) (b * 1000)) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlacesTwo(double a, double b) {
        int c = (int) (a * 1000);
        int d = (int) (b * 1000);

        if (c == d) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    /**
     * Created a version using the Scanner Class
     * 
     * @return boolean
     */
    public static boolean equalByThreeDecimalsWithScanner() {
        System.out.print("Check to see if 2 numbers are equal by three decimal places." + "\n"
        + "Enter your First Number: ");
        double firstNumber = sc.nextDouble();

        System.out.print("Enter your Second Number: ");
        double secondNumber = sc.nextDouble();

        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
            System.out.println(firstNumber + " && "
                    + secondNumber + " are equal by three decimal places.");
        } else {
            System.out.println("False. " + firstNumber + " && "
                    + secondNumber + " are not equal by three decimal places.");
            return false;
        }

        return false;
    }
}
