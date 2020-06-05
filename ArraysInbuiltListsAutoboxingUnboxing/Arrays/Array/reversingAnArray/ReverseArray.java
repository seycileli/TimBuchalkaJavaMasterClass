package arrays;

import java.util.Arrays;

public class ReverseArray {
    private static int[] myArray = {23, 30, 2, 43, 0, 55, 10};

    public static void main(String[] args) {
        System.out.println("Printing out your current list: "
                + Arrays.toString(myArray));

        reverse(myArray);
        System.out.print("\n" + "Here's how it looks reversed: " + Arrays.toString(myArray));
        
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i <= halfLength; i++) {
            int temporary = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temporary;
        }
    }
}
