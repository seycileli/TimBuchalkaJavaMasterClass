public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(5, 1, 5));
        System.out.println(canPackCommented(5, 1, 5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (((bigCount * 5) + smallCount) >= goal) {
            for (int i = 0; i <= bigCount; i++) {
                int big = i * 5;

                for (int j = 0; j <= smallCount; j++) {
                    if (big + j == goal) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean canPackCommented(int bigCount, int smallCount, int goal) {
        /*
        IF any of the PARAMETERS are NEGATIVE, return false

        To check this expression, we will create and use an IF statement
        Within the condition of the IF statement
        We will check if the method signature parameters are less than zero;
        (because anything less than zero is a negative)
        IF, either of the parameters are less than a zero, we will return back false;
         */
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        /*
        The parameter bigCount represents the count of big flour bags (5 kilos)
        (bigCount * 5);

        The parameter smallCount represents the count of small flour bags (1 kilo each)

        The parameter goal, represents the amount of kilos of flour needed to assemble a package

        Therefore, the sum of the kilos of bigCount and smallCount must be AT LEAST equal
        to the value of goal
         */

        /*
        We know here, that bigCount represents 5 kilos, so therefore when calculating, we will
        calculate as (bigCount * 5),

        Read carefully, the SUM of the kilos of bigCount and smallCount must be at least equal
        to the value of gol
        bigCount * 5 (1 * 5 = 5) 1 will be replaced with number choice from user input
        + 1 (or, number the user inputs in parameter)

        "Ensure that only full bags are used towards the goal amount"
        "bigCount and smallCount bags must be equal to goal,
        and it is OKAY if there are additional bags left over"

        for this reason,
        if -> bigCount * 5 + (sum) of smllCount <= goal,
        return true;
         */
        if (((bigCount * 5) + smallCount) >= goal) {
            /*
            we don't want flour bags to be larger than goal,
            so therefore we don't want i > bigCount or i > smallCount
             */

            for (int i = 0; i <= bigCount; i++) {
                //create new variable to store i * bigCount
                int big = i * 5;

                for (int j = 0; j <= smallCount; j++) {
                    //check condition if our new variable big + j is equal to goal

                    /*
                    why j?
                    we don't want j to exceed smallCount

                    j is less than or equal to smallCount

                    the below condition will check if big(i * 5) is equal to goal
                    if this condition is true, we will return true
                     */
                    if (big + j == goal) {
                        return true;
                    }
                }
            }
        }
        //IF big * j != to goal, return false
        return false;
    }
}
