import java.util.Scanner;

public class LeapYear {

    private static Scanner sc = new Scanner(System.in);
    private static int year;
    public static void main(String[] args) {

        isLeapYearChecker();
        leapYearSimple();

    }

    public static boolean isLeapYearChecker() {

        System.out.print("Leap Year checker." + "\n" +
                "Enter a year: " + "\n");

        if (year > 0 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("The Year " + year + " was Leap Year");
                        return true;
                    }
                }
            }
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The Year " + year + " was Leap Year.");
            return true;
        } else {
            System.out.println("The Year " + year + " was not Leap Year.");
            return false;
        }

        return false;
    }

    public static boolean leapYearSimple() {
        System.out.print("Leap Year checker." + "\n" +
                "Enter a year: " + "\n");

        year = sc.nextInt();

        if (year > 0 && year < 2020) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0
                    || year % 4 == 0 && year % 100 != 0) {
                System.out.println("The Year " + year + " was Leap Year");
                return true;
            } else {
                System.out.println("The Year " + year + " was not Leap Year");
                return false;
            }
        }

        //OR, past or future tense

        if (year > 2020 && year < 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0
                    || year % 4 == 0 && year % 100 != 0) {
                System.out.println("The Year " + year + " is Leap Year");
                return true;
            } else {
                System.out.println("The Year " + year + " is not Leap Year");
                return false;
            }
        }

        return false;
    }
}
