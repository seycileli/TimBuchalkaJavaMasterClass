import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        isLeapYear(-1600); //false because year is not in range
        isLeapYear(1600); //true
        isLeapYear(2017); //false
        isLeapYear(2000); //true

    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0
                    || year % 4 == 0 && year % 100 != 0) {
                return true;
            }
        }

        return false;
    }
}
