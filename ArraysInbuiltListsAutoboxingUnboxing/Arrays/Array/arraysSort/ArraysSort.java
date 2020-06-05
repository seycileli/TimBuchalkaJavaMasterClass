package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortArray(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " integer values: \r");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents: " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }
        //the below is an alternative to the above code
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temporary;

        while (flag) {
            flag = false;
            /*
            If for loop hasn't sorted out all of the numbers, we're going to assign it back to true
            so that the while loop continues.
             */
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;
                    flag = true;
                    /*
                    Store current value of the sortedArray into temporary variable

                    Afterwards, we move effectively, the element that is in [i + 1] position
                    are swapping the values around, for example

                    Array element in element position[0] = 3;
                    element[1] = 30;
                    element[2] = 200;

                    The loop will swap and sort the elements into their respectively position
                    After loop;
                    element[0] = 200;
                    element[1] = 30;
                    element[2] = 3;
                    boolean until condition is false;
                     */
                }
            }
        }
        return sortedArray;
    }
}
