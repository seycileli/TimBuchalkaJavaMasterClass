public class PrimeNumber {

    public static void main(String[] args) {

        testing();
    }

    public static boolean isPrime(int n) {

        /**
         * A prime number can be divided % evenly by 1 or by itself
         *
         * A prime number has to be a whole number (int) greater> than 1
         *
         * firstly, test variable to see if it is equal == to 1,
         * if it is not the number 1,
         *
         * because PRIME NUMBERS be divided evenly only by 1 or itself and
         * has to be a whole number greater than 1
         *
         * but if N is equaled to 1, return false
         *
         * for the for-loop,
         *
         * begin at 2, because prime number has to be greater than 1
         * no number greater than n divided by 2
         * n the remainder between n and i, dividing i into n,
         * check if equaled to zero, if it is zero
         * then it will mean that we found another number that divides evenly into the
         * number that we passed
         */

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            System.out.println("Looping " + i++);
            if (n % i == 0) {
                return false;
            }
        }

        //for advanced optimization, replace i <= n/2 with Math.sqrt(); method
        //for example i <= (long) Math.sqrt(n); i++; { ~ etc etc

        return true;
    }

    public static void testing() {
        /**
         * create a for statement using any range of numbers
         * int i = 0
         *
         * determine if the number is a prime using the isPrime method
         * if(isPrime());
         * if it is a prime number, increment a count of the number of prime numbers found
         *
         * if that count is 3, exit the for-loop
         *
         * hint: use the break; statement, to exit
         */

        int count = 0; //prime numbers in a count

        for (int i = 1; i < 50; i++) {
            //i will count 0 through 50 to find prime number

            //we will check if value is a prime number
            if (isPrime(i)) {
                count++;
                //if i is a prime number, we will increment the value and print out message below
                System.out.println("Number " + i + " is a prime number");
                if (count == 5) {
                    //if we've found 3 prime #s, we will then exit the for loop
                    System.out.println("\n" + "terminating for-loop");
                    break;
                }
            }
        }
    }
}
