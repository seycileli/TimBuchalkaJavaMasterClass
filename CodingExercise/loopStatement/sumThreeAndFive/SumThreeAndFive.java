public class SumThreeAndFive {

    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            //checking to see if i is divisible by 3 && 5, if neither has a remainder
            //both 3 && 5 has to be true inorder to execute what follows next within the code block
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i; //sum what we've found so far
                System.out.println("Found number = " + i);
            }

            //if we've found 5 numbers, break out of the for-loop
            if (count == 5) {
                break;
            }
        }

        //printing out sum
        System.out.println("Sum = " + sum);
    }
}
