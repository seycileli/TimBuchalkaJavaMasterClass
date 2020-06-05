package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        sc.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("The minimum number you entered was " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Let's begin!");
        for (int i = 0; i <= array.length -1; i++) {
            System.out.print("Enter a number for array[" + i + "]: \r");
            int number = sc.nextInt();
            sc.nextLine();
            array[i] = number;
        }
        System.out.println("\n" + "Got it! \n" +
                "Here are the elements inside of your array \n"
                + "int[] myArray = " + Arrays.toString(array) + "\n"
        + "Finding the minimum entered...");
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= array.length - 1; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
