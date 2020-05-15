package LoopExamples;

public class NumberPalindrome {

    public static void main(String[] args) {

        isPalindrome(101); //true, is palindrome
        isPalindrome(201); //false, is not palindrome

    }

    public static boolean isPalindrome(int number) {
        /**
         *         if (number < 10) {
         *             return -1;
         *         }
         *         int sum = 0;
         *
         *         //125 -> 125 / 10 = 12, 12 -> * 10 = 120, 120 -> 125 - 120 = 5
         *         while (number > 0) {
         *
         *             //extract the least significant digit
         *             int digit = number % 10;
         *             sum += digit;
         *
         *             //drop the least significant number in the digit
         *             number /= 10; //same as number = number / 10;
         *         }
         *         return sum;
         *
         *          //extract the last digit of a number by performing the modulo division
         *         //code goes here
         *         //increase the place of value of reverse by one,
         *
         *         //to increase place value, multiply the reverse variable by 10;
         *         //add lastDigit to reverse, for ig reverse + lastDigit;
         *
         *         //since the lastDigit of the number is processed, remove the last digit of number
         *         //for ig, number / 10;
         */

        int reverse = 0;
        int originalNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse = reverse + lastDigit;
            number /= 10;
        }

        if (originalNumber == reverse) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

}
