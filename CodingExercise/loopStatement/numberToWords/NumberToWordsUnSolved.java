package LoopExamples;

public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(1234);
        
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int count = 0;

            while (reversedNumber > 0) {
                int singleDigit = reversedNumber % 10;
                reversedNumber /= 10;
                count++;

                switch (singleDigit) {
                    case 0:
                        System.out.println("ZERO");
                        break;
                    case 1:
                        System.out.println("ONE");
                        break;
                    case 2:
                        System.out.println("TWO");
                        break;
                    case 3:
                        System.out.println("THREE");
                        break;
                    case 4:
                        System.out.println("FOUR");
                        break;
                    case 5:
                        System.out.println("FIVE");
                        break;
                    case 6:
                        System.out.println("SIX");
                        break;
                    case 7:
                        System.out.println("SEVEN");
                        break;
                    case 8:
                        System.out.println("EIGHT");
                        break;
                    case 9:
                        System.out.println("NINE");
                        break;
                    default:
                        System.out.println("Invalid Value");
                        break;
                }
            }

            int countTwo = getDigitCount(number);
            int difference = count - countTwo;

            if (!(difference == 0)) {
                for (int i = 0; i < difference; i++) {
                    System.out.println("ZERO");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;

        if (number < 0) {
            return -1;
        }

        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            count = 1;
        } else {
            while (number > 0) {
                count++;
                number /= 10;
            }
        }
        return count;
    }
}
