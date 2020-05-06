public class TeenNumberChecker {

    public static void main(String[] args) {

        hasTeen(9, 99, 19); //true because value in variable c is in range 13-19
        hasTeen(21, 15, 42); //true
        hasTeen(22, 23, 34); //false because values of the variables are not in range 13-19

        isTeen(9); //false since 9 is not in range
        isTeen(13); //true because 13 is in range 13-19

    }

    public static boolean hasTeen (int a, int b, int c) {

        if (a >= 13 && a <= 19 ||
            b >= 13 && b <= 19 ||
            c >= 13 && c <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen (int a) {
        if (a >= 13 && a <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
