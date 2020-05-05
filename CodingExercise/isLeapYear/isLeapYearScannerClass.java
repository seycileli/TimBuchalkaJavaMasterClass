import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        isLeapYear();

    }

    public static boolean isLeapYear() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Leap Year checker." + "\n" +
                "Enter a year: " + "\n");

        int year = sc.nextInt();

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
}
