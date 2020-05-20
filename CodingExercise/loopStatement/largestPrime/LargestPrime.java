package loopAlgorithms;

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(217)); //will return 31
        System.out.println("\n" + "Because i / j = Largest Prime number"
                + "\n" + "As well as, the largest prime number * (multiplied by) j " +
                "Gives us the Largest Prime number"
                + "\n" + "The entered number inside of the method parameter");
    }

    public static int getLargestPrime(int number) {
        int largestPrime = 1, count = 0;

        //1 is not a prime number, which is why our IF condition is
        //check condition IF number <= 1; if true, return -1;
        if (number <= 1) {
            return -1;
        } else {
            for (int i = 2; i <= number; i++) {
                System.out.println("i = " + i);

                if ((number % i) == 0) {
                    //i && j must = 2, because 1 is not a prime number; otherwise return will be null or NaN
                    for (int j = 2; j <= i / 2; j++) {
                        System.out.println("j <= i / 2 " + i);
                        System.out.println("j = " + j);

                        if ((i % j) == 0) {
                            count = 1;
                            System.out.println(i + " / " + j + " = ");
                            System.out.println("Largest Prime (" + largestPrime +
                                    ") x j (" + j + ") will equal = " +
                                    (largestPrime * j) + ". Which is what the user input");
                            break;
                        }
                    }
                    if (count == 0) {
                        largestPrime = i;
                    }
                }
            }
            System.out.print("Largest prime = ");
            return largestPrime;
        }
    }
}
