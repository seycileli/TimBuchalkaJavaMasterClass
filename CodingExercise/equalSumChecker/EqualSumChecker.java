public class EqualSumChecker {

    public static void main(String[] args) {

        hasEqualSum(1, 1, 1); //false
        hasEqualSumSimplified(1, 1, 2); //true
        hasEqualSum(1, -1, 0); //true
        hasEqualSumSimplified(10, 20, 30); //true
        hasEqualSumSimplified(10, 15, 100); //false

    }

    public static boolean hasEqualSum(int first, int second, int third) {

        if (first + second == third) {
            return true;
        } else if (first + second != third || first + third != second
                || second + third != first) {
            return false;
        }
        return false;
    }

    public static boolean hasEqualSumSimplified(int one, int two, int three) {

        if (one + two == three) {
            return true;
        } else {
            return false;
        }
    }
}
