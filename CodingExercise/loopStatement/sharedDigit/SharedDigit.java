package LoopExamples;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23)); //true
        System.out.println(hasASharedDigit(9, 9)); //false
        System.out.println(sharedDigitForLoop(9, 9)); //false
        System.out.println(sharedDigitForLoop(12, 23)); //true
        System.out.println(sharedDigitForLoop(100, 29)); //false

    }

    public static boolean hasSharedDigit(int numOne, int numTwo) {

        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            System.out.println("Not within range.");
            return false;
        }

        int firstNumber = 0;
        //we want to compare single digit numbers, therefore 10 < number
        while (10 < numOne) {
            firstNumber = numOne % 10;
            numOne /= 10;
        }

        int secNumber = 0;
        while (10 < numTwo) {
            secNumber = numTwo % 10;
            numTwo /= 10;
        }

        return numOne == numTwo || numOne == secNumber ||
                numTwo == firstNumber || firstNumber == secNumber;
    }

    public static boolean hasASharedDigit(int numOne, int numTwo) {
        if (numOne < 10 || numOne > 99 || numTwo < 10 || numTwo > 99) {
            System.out.println("Not within range.");
            return false;
        }

        int firstNum = 0, secondNum = 0;
        while (10 < numOne && 10 < numTwo) {
            firstNum = numOne % 10;
            numOne /= 10;

            secondNum = numTwo % 10;
            numTwo /= 10;
        }

        return numOne == numTwo || numOne == secondNum ||
                numTwo == firstNum || firstNum == secondNum;
    }

    public static boolean sharedDigitForLoop(int a, int b) {
        int digitOne = 0, digitTwo = 0;

        for (int i = 0; i < a && i < b; i++) {
            if (a < 10 || a > 99 || b < 10 || b > 99) {
                System.out.println("Not within range.");
                return false;
            }
            digitOne = a % 10;
            a /= 10;

            digitTwo = b % 10;
            b /= 10;
        }

        return a == b || a == digitTwo || b == digitOne || digitOne == digitTwo;
    }
}
