package scanner;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    private static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);

        readingUserInput();
        anotherVersion();
        alternativeToTimsSolution();

    }

    public static void readingUserInput() {
        int number;

        System.out.println("Enter number #1");
        number = sc.nextInt();
        System.out.println("Enter number #2");
        number += sc.nextInt();
        System.out.println("Enter number #3");
        number += sc.nextInt();
        System.out.println("#4");
        number += sc.nextInt();
        System.out.println("#5");
        number += sc.nextInt();
        System.out.println("#6");
        number += sc.nextInt();
        System.out.println("#7");
        number += sc.nextInt();
        System.out.println("#8");
        number += sc.nextInt();
        System.out.println("#9");
        number += sc.nextInt();
        System.out.println("#10");
        number += sc.nextInt();

        System.out.print("The sum of the numbers you input are: " + number);
        sc.close();
    }

    public static void anotherVersion() {
        int number = 0, count = 0;

        while (count < 10) {
            count++;
            System.out.println("Enter number " + count);
            number += sc.nextInt();
        }

        System.out.println("The sum of the numbers you input equal to " + number);
        sc.close();
    }

    public static void timsVersion() {
        int sum = 0, counter = 0;

        while (true) {
            int order = counter + 1; //counter starts at zero, which is why counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                int number = sc.nextInt();
                counter++;
                sum += number;

                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid entry.");
            }
            sc.nextLine(); //handle end of line (enter key)
        }
        sc.close();
    }

    public static void alternativeToTimsSolution() {
        int sum = 0, counter = 0;

        while (counter < 10) {

            int order = counter + 1;
            System.out.println("Enter a #" + order + ":");
            boolean nAn = sc.hasNextInt();

            if (nAn) {
                int number = sc.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid entry.");
            }
            sc.nextLine();
        }
        System.out.println("Your entered number sum = " + sum);
        sc.close();
    }
}
