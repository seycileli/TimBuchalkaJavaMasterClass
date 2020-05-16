public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigitSum(252));
        System.out.println(sumFirstAndLastDigitSum(257));
        System.out.println(sumFirstAndLastDigitSum(0));
        System.out.println(sumFirstAndLastDigitSum(5));
        System.out.println(sumFirstAndLastDigitSum(-10));

        //testing method
        System.out.println(firstDigit(500));

        //testing method
        System.out.println(lastDigit(5001));

    }

    public static int sumFirstAndLastDigitSum(int number) {
        int first, last;

        //anything less than zero is negative, so therefore number < 0 in IF condition
        if (number < 0) {
            //IF number is NEGATIVE return -1;
            return -1;
        }

        first = number;
        last = number;
        while (first >= 10 && last >= 0) {
            first /= 10;
            last %= 10;

            /**
             * How this code works && how I've come up with the solution:
             *
             * We want to extract the FIRST & LAST digit of NUMBER
             *
             * to extract the FIRST DIGIT of NUMBER,
             * we'll first assign the variable number to the int variable first
             * (we'll also do the same with last)
             *
             * and inside of the WHILE LOOP condition, we'll want to check if
             * FIRST(number) is GREATER THAN or EQUAL TO 10,
             * with FIRST(number) being GREATER THAN or EQUAL TO 10;
             * to extract the FIRST DIGIT, we'll want to divide first by 10;
             *
             * while loop will check the condition, and will continue to iterate until condition is false
             * for example, this is what the loop is doing until the condition becomes false;
             *
             * While Loop first iteration while (5000 >= 10)
             * first = first / 10; (5000 / 10 = 500)
             * is 500 greater than or equal to 10? yes/ true, will enter a second iteration
             *
             * while (500 >= 10)
             * first = first / 10; (500 / 10 = 50)
             * is 50 greater than or equal to 10? yes/ true, will enter third iteration
             *
             * while (50 >= 10)
             * first = first / 10; (50 / 10 = 5)
             * is 5 greater than or equal to 10? no/ false, will print 5 as output
             *
             * ==================
             * Same thing can be done with last digit, but swap divisible (/) with modulo (%) operator
             */
        }
        //this METHOD needs to RETURN the sum(+) of FIRST && LAST digit of a number (number variable)
        //keywords capitalized
        return first + last;
    }

    //testing, finding firstDigit
    public static int firstDigit(int number) {
        int first = number;

        while (first >= 10) {
            first /= 10;
        }

        return first;
    }

    //testing, finding lastDigit
    public static int lastDigit(int number) {
        int last = number;

        while (last >= 10) {
            last %= 10;
        }
        return last;
    }
}
