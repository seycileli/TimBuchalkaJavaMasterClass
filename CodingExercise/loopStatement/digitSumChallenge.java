package LoopExamples;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 = " +
                sumDigit(125)); //should return 8, since 1 + 2 + 5 = 8
    }

    public static int sumDigit(int number) {
        /**
         * Hint: use n % 10, to extract the least significant digit
         *       use n = n / 10 to discard the least significant digit
         *       the method needs to be static like other methods so far in the course
         */
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        //125 -> 125 / 10 = 12, 12 -> * 10 = 120, 120 -> 125 - 120 = 5
        while (number > 0) {

            //extract the least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant number in the digit
            number /= 10; //same as number = number / 10;
        }
        return sum;
    }
}
