package LoopExamples;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 30)); //6

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int getCommonDivisor = 1;

        if ((first >= 10) && (second >= 10)) {
            for (int i = 1; i <= first && i <= second; i++) {
                if (first % i == 0 && (second % i) == 0) {
                    getCommonDivisor = i;
                }
            }
            return getCommonDivisor;
        }
        return -1;
    }

    public static int commented(int first, int second) {
        /*
        We start at 1, because Zero is...well, Zero. Zero = nil; Zero = nada;
        most important >> Zero has no factors, so it can not have any common << most important

        The below integer expression will be replaced with the common Greatest Common Divisor (GCD) later
        Anything equaled to 1, becomes that number itself.
         */
        int gcd = 1;

        if ((first >= 10) && (second >= 10)) {
            /*
            We're looking for both numbers to be equaled to or greater than 10, not anything less than or negative
            If they happen to be less than or negative, outside of if statement, we will return -1;

            But now, IF both of the initialized variables happen to meet the condition inside of the IF statement
            we will proceed within the IF statement code block
             */

            for (int i = 1; i <= first && i <= second; i++) {
                if((first % i) == 0 && (second % i) == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }
        return -1;
    }
}
